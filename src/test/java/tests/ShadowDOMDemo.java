package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ShadowDOMDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.get("file:///Users/vaibhavsingh/Desktop/teche-apps/merv/ey-automation-testing/test2.html");

        WebElement shadowDiv = driver.findElement(By.id("host-element"));
        SearchContext shadowRoot = shadowDiv.getShadowRoot();

        shadowRoot.findElement(By.id("insideshadowinput")).sendKeys("Test1");

        //driver.findElement(By.xpath("")).

    }
}
