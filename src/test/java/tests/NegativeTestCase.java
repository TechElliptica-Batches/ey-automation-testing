package tests;

import module.LoginModule;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.ScreenshotUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.List;

@Listeners(EyTestListener.class)
public class NegativeTestCase extends  TestCaseBase{
    // empty credential
    // Test Data driven
    // 2D array - Excel sheet

    public static Object[][] getDatafromExcel() throws IOException {
        String str = "/Users/vaibhavsingh/Desktop/teche-apps/merv/ey-automation-testing/excel/userExcel.xls";

        // Workbook  HSSF - xls, XSSF - .xlsx
        Workbook workbook = new HSSFWorkbook(new FileInputStream(new File(str)));

        // getting your sheet
        Sheet sheet = workbook.getSheet("User");

        // getting rows
        int totalRows = sheet.getLastRowNum();
        int totalColumn = sheet.getRow(0).getLastCellNum();
        Object[][] data = new Object[totalRows][totalColumn];

        for(int i = 0; i < totalRows ; i++){
            Row row = sheet.getRow(i);
            // Get Cell
            int totalColumns = row.getLastCellNum();
            for(int j = 0; j < totalColumns ; j++){
                Cell cl = row.getCell(j);
                data[i][j] = cl.getStringCellValue();
//                System.out.print(cl.getStringCellValue() + " ");

            }
            System.out.println();
        }
        workbook.close();
        return data;
    }


    @DataProvider(name = "sauce-demo-login-data")
    public static Object[][] loginData() throws IOException {
//        List<String> allLines = Files.readAllLines(Paths.get("/Users/vaibhavsingh/Desktop/teche-apps/merv/ey-automation-testing/files/25-01-2026/testdata.txt"));
//        String[][] dataArr = new String[allLines.size()][3];
//        for(int i = 0 ; i < allLines.size() ; i++){
//            String line = allLines.get(i);
//            String[] data = line.split(",");
//            dataArr[i] = data;
//        }
         //return dataArr;
        try{
            return getDatafromExcel();
        }catch (Exception e){
            return null;
        }
    }

    @Test(dataProvider = "sauce-demo-login-data")
    public void verify_user_able_to_view_error_msg_for_credentials
            (String username, String password) throws IOException {




        TestCaseBase.test.info("Username : " + username);
        TestCaseBase.test.info("Password : " + password);
        LoginModule.login(driver,username, password);
        String actualErrorMsg = LoginModule.getErrorMessage(driver);

        // How to verify our expected and actual
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualErrorMsg, "Epic sadface: Username and password do not match any user in this service");
        String screenshotPath = ScreenshotUtils.getScreenshot(driver);
        TestCaseBase.test.addScreenCaptureFromPath(screenshotPath);
        // hard Assertion
        softAssert.assertAll();

        // 2 type of Assertion - Verificatin
        // Hard Assertion - If Hard assertion fail, then next step will not execute
       //

        // Soft Assertion - if softasseertion failed. then it will still execute the next step
        // placing Order
        // Order id      -
        // Order name    -
        // Order price   -
        // Order status  -


    }


//    @Test()
//    public void verify_user_able_to_view_error_msg_for_empty_credentials(){
//        LoginModule.login(driver,"", "");
//    }
//
//    @Test()
//    public void verify_user_able_to_view_error_msg_for_empty_username(){
//        LoginModule.login(driver,"", "secret_sauce");
//    }
//
//    @Test()
//    public void verify_user_able_to_view_error_msg_for_empty_password(){
//        LoginModule.login(driver,"standard_user", "");
//    }

}
