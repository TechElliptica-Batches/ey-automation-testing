package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertDemo {
    public static void main(String[] args) {
        // Auth popup
        // https://username:password@link

        ChromeDriver driver = new ChromeDriver();
        driver.get("file:///Users/vaibhavsingh/Desktop/teche-apps/merv/ey-automation-testing/test1.html");

        driver.findElement(By.xpath("/html/body/button")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();

        String popUpText = alert.getText();
        System.out.println(popUpText);

        alert.accept();


    }
}
