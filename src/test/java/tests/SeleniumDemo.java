package tests;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;

public class SeleniumDemo {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        String title = driver.getTitle();
        System.out.println(title);
        String url = driver.getCurrentUrl();
        System.out.println(url);

        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");

        // Window Handles



        //driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

        // rightclick - context click
        // double click -
        // mouse move
        // scroll

//        Actions action = new Actions(driver);
//        action.contextClick(driver.findElement(By.xpath("//*[@id=\"login-button\"]")))
//                .build().perform();


        // Drop Down

        // How to interact with Dropdown
//        Select priceDropDown = new Select(driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")));
//        priceDropDown.selectByVisibleText("Name (Z to A)");
//
//        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(screenshot , new File("/Users/vaibhavsingh/Desktop/teche-apps/merv/ey-automation-testing/screenshot/login.png"));

        // Action classes

        //
        //priceDropDown.selectByValue("za");
        //priceDropDown.selectByIndex(2);




      //  driver.close();   // active handle tab
      //  driver.quit();      // all the tab (entire session)
    }
}
