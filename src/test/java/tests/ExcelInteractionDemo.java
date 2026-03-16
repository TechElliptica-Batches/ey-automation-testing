package tests;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelInteractionDemo {
    public static void main(String[] args) throws IOException {
        String str = "/Users/vaibhavsingh/Desktop/teche-apps/merv/ey-automation-testing/excel/userExcel.xls";
        // Workbook  HSSF - xls, XSSF - .xlsx
        Workbook workbook = new HSSFWorkbook(new FileInputStream(new File(str)));
        // getting your sheet
        Sheet sheet = workbook.getSheet("User");
        // getting rows
        int totalRows = sheet.getLastRowNum();
        for(int i = 0; i < totalRows ; i++){
            Row row = sheet.getRow(i);
            // Get Cell
            int totalColumns = row.getLastCellNum();
            for(int j = 0; j < totalColumns ; j++){
                Cell cl = row.getCell(j);
                System.out.print(cl.getStringCellValue() + " ");
            }
            System.out.println();
        }
        workbook.close();
    }
}
