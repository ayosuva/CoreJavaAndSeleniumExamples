package com.example.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class IframeExample {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame(0);
        //InteractionsAndNavigations.wait(3000);
        driver.findElement(By.xpath("//p")).clear();
        driver.findElement(By.xpath("//p")).sendKeys("Hello Qualitest");
        driver.switchTo().defaultContent();
        System.out.println(driver.findElement(By.xpath("//h3")).getText());
        InteractionsAndNavigations.wait(3000);
        driver.quit();
    }

}
