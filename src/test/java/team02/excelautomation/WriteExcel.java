package team02.excelautomation;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel {

    @Test
    public void test() throws IOException {

        String path = "C:\\Users\\mk201\\IdeaProjects\\team02_Selenium01\\src\\test\\resources\\SINIF.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        workbook.getSheetAt(0).getRow(0).createCell(3).setCellValue("Yas");
        workbook.getSheetAt(0).getRow(1).createCell(3).setCellValue("10");
        workbook.getSheetAt(0).getRow(2).createCell(3).setCellValue("9");
        workbook.getSheetAt(0).getRow(3).createCell(3).setCellValue("9");
        workbook.getSheetAt(0).getRow(4).createCell(3).setCellValue("10");
        workbook.getSheetAt(0).getRow(5).createCell(3).setCellValue("10");
        workbook.getSheetAt(0).getRow(6).createCell(3).setCellValue("9");
        workbook.getSheetAt(0).getRow(7).createCell(3).setCellValue("9");
        workbook.write(fileOutputStream);
        fileInputStream.close();
        fileOutputStream.close();
        workbook.close();

    }

}
