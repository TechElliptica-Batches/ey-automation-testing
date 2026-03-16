package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentDemo {
    public static void main(String[] args) {

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH-mm");
        String formattedDate = format.format(new Date());
        ExtentSparkReporter report = new ExtentSparkReporter("reports/automation_"+formattedDate+".html");
        ExtentReports suite = new ExtentReports();
        suite.attachReporter(report);

        ExtentTest test = suite.createTest("test 1 Validate login functionality");
        test.info("user open chrome");
        test.info("user entering username in username");
        test.info("user entering password in password");
        test.info("user sign in button");

        test.addScreenCaptureFromPath("/Users/vaibhavsingh/Desktop/teche-apps/merv/ey-automation-testing/screenshot/login.png");

        ExtentTest test1 = suite.createTest("test 2 Validate login functionality");
        test1.info("user open chrome");
        test1.info("user entering username in username");
        test1.fail("user entering password in password").addScreenCaptureFromPath("/Users/vaibhavsingh/Desktop/teche-apps/merv/ey-automation-testing/screenshot/login.png");

        test1.pass("user sign in button");


        suite.flush();

    }
}
