package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestCaseBase {

    public static WebDriver driver;

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

    public static void openBrowser(String browsername){
        if(browsername.equals("chrome")){
            driver = new ChromeDriver();
        }else if(browsername.equals("edge")){
            driver = new EdgeDriver();
        }
    }

    public static void openUrl(String url){
        //String enviornment=  System.getProperty("env");
       // if(enviornment.equals("qa")) {
            driver.get(url);
        //}
    }


}
