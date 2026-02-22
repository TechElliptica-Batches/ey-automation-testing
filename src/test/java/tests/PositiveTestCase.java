package tests;

import module.LoginModule;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pageobject.LoginPage;

public class PositiveTestCase extends TestCaseBase{

    // login successfully
    //@Test
    public void verify_user_able_to_login_successfully(){
        LoginModule.login(driver,"standard_user", "secret_sauce");
    }

}
