package module;

import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.LoginPage;

public class LoginModule {
    public static void login(ChromeDriver driver, String username, String password){
        driver.findElement(LoginPage.txtbox_username).sendKeys(username);
        driver.findElement(LoginPage.txtbox_password).sendKeys(password);
        driver.findElement(LoginPage.btn_login).click();
    }

    public static String getErrorMessage(ChromeDriver driver){
        String errorMsg = driver.findElement(LoginPage.txt_errorMsg).getText();
        return errorMsg;
    }

}
