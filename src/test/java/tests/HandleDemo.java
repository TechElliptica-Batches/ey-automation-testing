package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HandleDemo {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("file:///Users/vaibhavsingh/Desktop/teche-apps/merv/ey-automation-testing/test1.html");


        String ey_testometer_tab_handle = driver.getWindowHandle();
        System.out.println(ey_testometer_tab_handle);

        System.out.println("==============================");
        driver.findElement(By.xpath("/html/body/div[2]/a[1]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/a[2]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/a[3]")).click();
        Set<String> allHandles = driver.getWindowHandles();

        for(String handle: allHandles){
            System.out.println(handle);
            driver.switchTo().window(handle);
            System.out.println(driver.getTitle());
            if(driver.getTitle().contains("Amazon.com")){
                break;
            }
        }

        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobiles");
//        driver.switchTo().window("Google");

       // driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Sachin");




        // selenium work on window handle concept
        //every window will have a unique handle



    }
}
