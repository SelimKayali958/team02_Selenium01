package team02.excelautomation;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadExcel {

    @Test
    public void test () throws IOException {

        String path = "C:\\Users\\mk201\\IdeaProjects\\team02_Selenium01\\src\\test\\resources\\SINIF.xlsx";


        FileInputStream fileInputStream = new FileInputStream(path);

        Workbook workbook = WorkbookFactory.create(fileInputStream);

        Sheet sheet = workbook.getSheetAt(0);

        Row row = sheet.getRow(0);

        Cell cell = row.getCell(0);

        int satirSayisi = workbook.getSheetAt(0).getLastRowNum()+1;
        int sutunSayisi = workbook.getSheetAt(0).getRow(0).getLastCellNum();

        for (int i = 0 ; i<sutunSayisi;i++) {
            System.out.print(workbook.getSheetAt(0).getRow(0).getCell(i)+" ");
        }
        System.out.println();
        System.out.println();
        for (int i = 0 ; i<sutunSayisi;i++) {
            System.out.print(workbook.getSheetAt(0).getRow(1).getCell(i)+" ");
        }
        System.out.println();
        System.out.println();
        for (int i = 0 ; i<sutunSayisi;i++) {
            System.out.print(workbook.getSheetAt(0).getRow(2).getCell(i)+" ");
        }
        System.out.println();
        System.out.println();
        for (int i = 0 ; i<sutunSayisi;i++) {
            System.out.print(workbook.getSheetAt(0).getRow(3).getCell(i)+" ");
        }
        System.out.println();
        System.out.println();
        for (int i = 0 ; i<sutunSayisi;i++) {
            System.out.print(workbook.getSheetAt(0).getRow(4).getCell(i)+" ");
        }
        System.out.println();
        System.out.println();
        for (int i = 0 ; i<sutunSayisi;i++) {
            System.out.print(workbook.getSheetAt(0).getRow(5).getCell(i)+" ");
        }
        System.out.println();
        System.out.println();
        for (int i = 0 ; i<sutunSayisi;i++) {
            System.out.print(workbook.getSheetAt(0).getRow(6).getCell(i)+" ");
        }
        System.out.println();
        System.out.println();
        for (int i = 0 ; i<sutunSayisi;i++) {
            System.out.print(workbook.getSheetAt(0).getRow(7).getCell(i)+" ");
        }
        System.out.println();
        System.out.println();
        for (int i = 0 ; i<satirSayisi;i++) {
            System.out.println(workbook.getSheetAt(0).getRow(i).getCell(0));
        }
        System.out.println();
        System.out.println();
        for (int i = 0 ; i<satirSayisi;i++) {
            System.out.println(workbook.getSheetAt(0).getRow(i).getCell(1));
        }
        System.out.println();
        System.out.println();
        for (int i = 0 ; i<satirSayisi;i++) {
            System.out.println(workbook.getSheetAt(0).getRow(i).getCell(2));
        }
        System.out.println();
        System.out.println();
        for (int i = 0 ; i<satirSayisi;i++) {
            for (int k = 0 ;k<sutunSayisi;k++) {
                System.out.print(workbook.getSheetAt(0).getRow(i).getCell(k)+" ");
            }
            System.out.println();
        }


        fileInputStream.close();
        workbook.close();


    }


}
