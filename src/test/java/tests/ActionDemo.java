package tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.get("file:///Users/vaibhavsingh/Desktop/teche-apps/merv/ey-automation-testing/test1.html");

        // double click, right click, move to element
        Actions action = new Actions(driver);
        WebElement calendarElem = driver.findElement(By.id("name"));

//        action.contextClick(calendarElem)
//                .pause(Duration.ofSeconds(2))
//                .sendKeys(Keys.DOWN)
//                .pause(Duration.ofSeconds(2))
//                .sendKeys(Keys.ENTER)
//                .build().perform();

        //action.doubleClick(calendarElem).build().perform();
//        action.moveToElement(calendarElem)
//                .pause(Duration.ofSeconds(1))
//                .click(calendarElem)
//                .sendKeys("test1").build().perform();

        // element  - abc
        // after 2-3 scroll

        // driver.findELemnt(username).sendKeys("");
        // driver.findELemnt(password).sendKeys("");
        // driver.findElement(signin).click()

        getElementUntilNotFound(driver, By.xpath("//abc"));

    }





    public static WebElement getElementUntilNotFound(WebDriver driver, By by){
        int threshold = 10;
        int startScroll = 0;
        boolean isElementFound = false;

        while(startScroll < threshold || isElementFound) {
            try {
                WebElement elm = driver.findElement(by);
                return elm;
            } catch (NoSuchElementException e) {
                new Actions(driver).scrollByAmount(0, 500);
                startScroll++;
            }
        }
        return null;
    }

}
