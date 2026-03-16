package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestCaseBase {

    public static WebDriver driver;
    public static ExtentReports suite;
    public static ExtentTest test;
    @BeforeSuite
    public void setUpSuite(){
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH-mm");
        String formattedDate = format.format(new Date());
        ExtentSparkReporter report = new ExtentSparkReporter("reports/automation_"+formattedDate+".html");
        suite = new ExtentReports();
        suite.attachReporter(report);
    }

    @AfterSuite
    public void afterSuite(){
        suite.flush();
    }

    @BeforeMethod(alwaysRun = true)
    public void setupTestCase(Method method) throws MalformedURLException {
        ChromeOptions option = new ChromeOptions();
//        option.setPlatformName(Platform.WINDOWS.toString());

        driver = new RemoteWebDriver(new URL("http://192.168.1.23:4444"), option);

        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();

    }

    @AfterMethod(alwaysRun = true)
    public void afterTestCase(){
        //driver.close();
        driver.quit();
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
