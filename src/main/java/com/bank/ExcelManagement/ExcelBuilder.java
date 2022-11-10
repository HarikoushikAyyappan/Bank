package com.bank.ExcelManagement;

import com.bank.model.Customer;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

import static org.apache.poi.hssf.util.HSSFColor.*;
import static org.apache.poi.hssf.util.HSSFColor.HSSFColorPredefined.BLUE;
import static org.apache.poi.hssf.util.HSSFColor.HSSFColorPredefined.WHITE;

/**
 * This class builds an Excel spreadsheet document using Apache POI library.
 *
 */
public class ExcelBuilder extends AbstractXlsView {

    @Override
    protected void buildExcelDocument(Map<String, Object> map, Workbook workbook, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        // get data model which is passed by the Spring container
        List<Customer> listCustomer = (List<Customer>) map.get("listCustomer");

        // create a new Excel sheet
        HSSFSheet sheet = (HSSFSheet) workbook.createSheet("Bank Customers");
        sheet.setDefaultColumnWidth(30);

        // create style for header cells
        CellStyle style = workbook.createCellStyle();
        Font font = workbook.createFont();
        font.setFontName("Arial");
        font.setItalic(true);
        style.setFont(font);

        // create header row
        HSSFRow header = sheet.createRow(0);

        header.createCell(0).setCellValue("CustomerId");
        header.getCell(0).setCellStyle(style);

        header.createCell(1).setCellValue("CustomerName");
        header.getCell(1).setCellStyle(style);

        header.createCell(2).setCellValue("Aadhar");
        header.getCell(2).setCellStyle(style);

        header.createCell(3).setCellValue("Profession");
        header.getCell(3).setCellStyle(style);

        header.createCell(4).setCellValue("BankName");
        header.getCell(4).setCellStyle(style);

        // create data rows
        int rowCount = 1;

        for (Customer customer : listCustomer) {
            HSSFRow aRow = sheet.createRow(rowCount++);
            aRow.createCell(0).setCellValue(customer.getCustomerId());
            aRow.createCell(1).setCellValue(customer.getCustomerName());
            aRow.createCell(2).setCellValue(customer.getAadhar());
            aRow.createCell(3).setCellValue(customer.getProfession());
            aRow.createCell(4).setCellValue(customer.getBankName());
        }
    }
}
