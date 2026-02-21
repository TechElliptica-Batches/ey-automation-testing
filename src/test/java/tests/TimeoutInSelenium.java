package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TimeoutInSelenium {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // driver, global
        driver.get("file:///Users/vaibhavsingh/Desktop/teche-apps/merv/ey-automation-testing/test1.html");

        driver.findElement(By.xpath("/html/body/button")).click();
        // Explicit Wait = WebElement level wait
        WebDriverWait expWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        expWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"namevalue\"]")));

        String labelText = driver.findElement(By.xpath("//*[@id=\"namevalue\"]")).getText();
        System.out.println(labelText);


    }
}
