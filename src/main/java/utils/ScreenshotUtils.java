package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class ScreenshotUtils {

    public static String getScreenshot(WebDriver driver) throws IOException {
        File fl = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String name = "/Users/vaibhavsingh/Desktop/teche-apps/merv/ey-automation-testing/screenshot/"+new Date().getTime() + ".png";
        FileUtils.copyFile(fl, new File(name));
        return name;
    }
}
