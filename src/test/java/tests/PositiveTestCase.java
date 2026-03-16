package tests;

import module.LoginModule;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageobject.LoginPage;


@Listeners({EyTestListener.class})
public class PositiveTestCase extends TestCaseBase{

    private static final Logger log = LogManager.getLogger(PositiveTestCase.class);

    // login successfully
    // flaky test case
    // once test case fail. retry the test , keep retrying it for a max time 2

    @Test(retryAnalyzer = tests.RetryScript.class , groups="sanity2345")
    public void verify_user_able_to_login_successfully(){

        TestCaseBase.test.info("Username : " + "standard_user");
        TestCaseBase.test.info("Password : " + "secret_sauce");
        LoginModule.login(driver,"standard_user", "secret_sauce");
        TestCaseBase.test.pass("User logged in with credentials");
        Assert.assertEquals(driver.getTitle(), "Swag Labs1234");
        TestCaseBase.test.pass("User able to see Swag Labs title");

    }

}
