package com.bank.service;
import java.util.List;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.bank.model.Customer;
import com.bank.report.FillManager;
import com.bank.report.Layouter;
import com.bank.report.Writer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.bank.service.UserService;

import javax.annotation.Resource;

/**
 * Service for processing Apache POI-based reports
 *
 */
@Service("excelService")
@Transactional
public class ExcelService {
    @Autowired
    UserService userService;

    private static Logger logger = Logger.getLogger("service");

    /**
     * Processes the download for Excel format.
     * It does the following steps:
     * <pre>1. Create new workbook
     * 2. Create new worksheet
     * 3. Define starting indices for rows and columns
     * 4. Build layout
     * 5. Fill report
     * 6. Set the HttpServletResponse properties
     * 7. Write to the output stream
     * </pre>
     */
    @SuppressWarnings("unchecked")
    public void downloadXLS(HttpServletResponse response) throws ClassNotFoundException {
        logger.debug("Downloading Excel report");

        // 1. Create new workbook
        HSSFWorkbook workbook = new HSSFWorkbook();

        // 2. Create new worksheet
        HSSFSheet worksheet = workbook.createSheet("POI Worksheet");

        // 3. Define starting indices for rows and columns
        int startRowIndex = 0;
        int startColIndex = 0;

        // 4. Build layout
        // Build title, date, and column headers
        Layouter.buildReport(worksheet, startRowIndex, startColIndex);

        // 5. Fill report
        FillManager.fillReport(worksheet, startRowIndex, startColIndex, getDatasource());

        // 6. Set the response properties
        String fileName = "SalesReport.xls";
        response.setHeader("Content-Disposition", "inline; filename=" + fileName);
        // Make sure to set the correct content type
        response.setContentType("application/vnd.ms-excel");

        //7. Write to the output stream
        Writer.write(response, worksheet);
    }

    /**
     * Retrieves the datasource as as simple Java List.
     * The datasource is retrieved from a Hibernate HQL query.
     */
    @SuppressWarnings("unchecked")
    private List<Customer> getDatasource() {

        List<Customer> result = userService.getAllCustomer();
        // Return the datasource
        return result;
    }
}