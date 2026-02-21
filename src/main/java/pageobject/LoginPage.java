package pageobject;

import org.openqa.selenium.By;

public class LoginPage {
    public static By txtbox_username =  By.xpath("//*[@id=\"user-name\"]");
    public static By txtbox_password =  By.xpath("//*[@id=\"password\"]");
    public static By btn_login = By.xpath("//*[@id=\"login-button\"]");

    public static By txt_errorMsg = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3");

}
