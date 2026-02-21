package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestCaseBase {

    ChromeDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void setupTestCase(){
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();
    }

    @AfterMethod(alwaysRun = true)
    public void afterTestCase(){
        driver.close();
    }
}
