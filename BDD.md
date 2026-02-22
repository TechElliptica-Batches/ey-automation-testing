
What is BDD 

BDD - Behaviour Driven Development

We are our code in simple english language
Gherkin language
# parameterised 
# user step keywords - 
Given - prereq
When  - action
Then  - validation
And  



Given i open "chrome"
Given i open url "https://wwww.saucedemo.com"
When i enter "standard_user" in username field
When i enter "secret_Sauce" in password field
When i click in signin button
Then i validate error message as "username required"


specflow, serenity, cucumber


1 - Get Dependency from maven prtal (io.cucumber and cucumber-testng)
2 - build your project

3 - create package - stepdef and testrunner

4 - in testrunner file

@CucumberOptions(
features = "features/login.feature",
glue = "stepdef" ,
dryRun = true,
tags = "@sanity"
)
public class TestRunner extends AbstractTestNGCucumberTests {

}


now execute

it will generate all stepdef in console
copy that
and keep it in class inside glue - stepdef


mvn test -Dcucumber.features='features/login.feature' -Dcucumber.glue='stepdef'






