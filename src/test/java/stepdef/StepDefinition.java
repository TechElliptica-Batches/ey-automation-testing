package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import module.LoginModule;
import org.testng.Assert;
import tests.TestCaseBase;

public class StepDefinition {
    @Given("i open {string}")
    public void i_open(String string) {
        TestCaseBase.openBrowser(string);
    }
    @Given("i open url {string}")
    public void i_open_url(String string) {
        TestCaseBase.openUrl(string);
    }
    @When("i enter {string} in username field")
    public void i_enter_in_username_field(String string) {
        LoginModule.enterUserName(TestCaseBase.driver, string);
    }
    @When("i enter {string} in password field")
    public void i_enter_in_password_field(String string) {
        LoginModule.enterPassword(TestCaseBase.driver, string);
    }
    @When("i click in signin button")
    public void i_click_in_signin_button() {
        LoginModule.clickSignIn(TestCaseBase.driver);
    }
    @Then("i verify dashboard")
    public void i_verify_dashboard() {

    }

    @Then("i validate error message as {string}")
    public void i_validate_error_message_as(String string) {
        String actualMessage = LoginModule.getErrorMessage(TestCaseBase.driver);
        Assert.assertEquals(actualMessage, string);
    }

}
