/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ireportex;

import com.report.model.ConfirmWork;
import com.report.model.ReportModel;
import com.report.model.work;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class IreportEX {
    private static String reportFileName="report\\ThaiReport.Jrxml";
    private static String outputFileName="output\\output.pdf";
    private static String reportPersonFileName="report\\confirm_work.Jrxml";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List lis = new ArrayList();
        Date f = new Date();
        //ReportModel re = new ReportModel();
        
        work re = new work();
        re.setAddress("268/53 ซอย เยาวภา ถนนประชาราษฏร์สาย 2 เขตบางซื่อ");
        re.setName("สุรชัย นุ่มประสงค์");
        re.setPosition("programmer");
        re.setWriteplace("บ้าน");
        re.setOffice("iconext");
        re.setStartdate(f);
        re.setEnddate(f);
        re.setWritedate(f);
        lis.add(re);
        JRBeanCollectionDataSource beanCollectionDataSource = new JRBeanCollectionDataSource(lis); 
        try {
            JasperReport jasperReport = JasperCompileManager.compileReport(reportPersonFileName);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,new HashMap(), beanCollectionDataSource);
            JasperExportManager.exportReportToPdfFile(jasperPrint, outputFileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
