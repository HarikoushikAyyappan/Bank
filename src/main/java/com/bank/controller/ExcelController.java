package com.bank.controller;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import com.bank.service.ExcelService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles download requests
 *
 */
@Controller
public class ExcelController {

    private static Logger logger = Logger.getLogger("controller");

    @Resource(name="downloadService")
    private ExcelService downloadService;

    /**
     * Downloads the report as an Excel format.
     * <p>
     * Make sure this method doesn't return any model. Otherwise, you'll get
     * an "IllegalStateException: getOutputStream() has already been called for this response"
     */
    @RequestMapping(value = "/download", method = RequestMethod.GET)
    public void getXLS(HttpServletResponse response, Model model) throws ClassNotFoundException {
        logger.debug("Received request to download report as an XLS");

        // Delegate to downloadService. Make sure to pass an instance of HttpServletResponse
        downloadService.downloadXLS(response);
    }
}