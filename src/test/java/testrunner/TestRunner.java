package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
      features = "features/login.feature",
      glue = "stepdef" ,
      dryRun = false,
      tags = "@postive-scenario"
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
