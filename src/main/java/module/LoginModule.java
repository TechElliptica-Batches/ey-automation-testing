package module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.LoginPage;

public class LoginModule {
    public static void login(WebDriver driver, String username, String password){
        driver.findElement(LoginPage.txtbox_username).sendKeys(username);
        driver.findElement(LoginPage.txtbox_password).sendKeys(password);
        driver.findElement(LoginPage.btn_login).click();
    }

    public static String getErrorMessage(WebDriver driver){
        String errorMsg = driver.findElement(LoginPage.txt_errorMsg).getText();
        return errorMsg;
    }

    public static void enterUserName(WebDriver driver, String username){
        driver.findElement(LoginPage.txtbox_username).sendKeys(username);
    }
    public static void enterPassword(WebDriver driver, String password){
        driver.findElement(LoginPage.txtbox_password).sendKeys(password);
    }
    public static void clickSignIn(WebDriver driver){
        driver.findElement(LoginPage.btn_login).click();
    }


}
