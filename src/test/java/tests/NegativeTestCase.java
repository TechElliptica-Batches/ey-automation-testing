package tests;

import module.LoginModule;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class NegativeTestCase extends  TestCaseBase{
    // empty credential
    // Test Data driven
    // 2D array - Excel sheet


    @DataProvider(name = "sauce-demo-login-data")
    public static Object[][] loginData() throws IOException {
        List<String> allLines = Files.readAllLines(Paths.get("/Users/vaibhavsingh/Desktop/teche-apps/merv/ey-automation-testing/files/25-01-2026/testdata.txt"));
        String[][] dataArr = new String[allLines.size()][3];
        for(int i = 0 ; i < allLines.size() ; i++){
            String line = allLines.get(i);
            String[] data = line.split(",");
            dataArr[i] = data;
        }
         return dataArr;
    }

    //@Test(dataProvider = "sauce-demo-login-data")
    public void verify_user_able_to_view_error_msg_for_credentials(String username, String password, String expectedErrorMsg){
        LoginModule.login(driver,username, password);
        String actualErrorMsg = LoginModule.getErrorMessage(driver);
        // How to verify our expected and actual
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualErrorMsg, expectedErrorMsg);  // hard Assertion
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
