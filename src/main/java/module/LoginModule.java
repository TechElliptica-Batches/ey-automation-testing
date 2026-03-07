package module;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.LoginPage;

public class LoginModule {
    private static final Logger log = LogManager.getLogger(LoginModule.class);

    public static void login(WebDriver driver, String username, String password){
        log.trace("login method execution started");
        log.debug("username : " + username);
        log.debug("password : " + password);
        driver.findElement(LoginPage.txtbox_username).sendKeys(username);
        log.debug("username entered successfully");
        driver.findElement(LoginPage.txtbox_password).sendKeys(password);
        log.debug("password entered successfully");
        driver.findElement(LoginPage.btn_login).click();
        log.debug("button clicked successfully");
        log.trace("login method execution completed");
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
