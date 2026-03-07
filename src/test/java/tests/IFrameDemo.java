package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class IFrameDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.get("file:///Users/vaibhavsingh/Desktop/teche-apps/merv/ey-automation-testing/test2.html");


        driver.switchTo().frame("saucedemo");
        driver.findElement(By.id("user-name")).sendKeys("test");

        driver.switchTo().defaultContent();
        driver.findElement(By.id("name")).sendKeys("Testdata");

        // defaultContent - bring you back at root level
        // parent-frame = bring you back to parent frame

//        page
//            iframe1
//                 iframe3
//                     iframe4
//                            iframe5
//            iframe2


    }
}
