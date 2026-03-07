package tests;

import module.LoginModule;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.LoginPage;
import utils.RetryScript;

public class PositiveTestCase extends TestCaseBase{

    private static final Logger log = LogManager.getLogger(PositiveTestCase.class);

    // login successfully
    // flaky test case
    // once test case fail. retry the test , keep retrying it for a max time 2

    @Test(retryAnalyzer = RetryScript.class , groups="sanity2345")
    public void verify_user_able_to_login_successfully(){

        log.trace("trace");
        log.debug("debug");
        log.info("info");
        log.warn("warn");
        log.error("error");
        log.fatal("fatal");

        log.info("I am executing login success scenario");



        LoginModule.login(driver,"standard_user", "secret_sauce");
        Assert.assertEquals(driver.getTitle(), "Swag Labs");
    }

}
