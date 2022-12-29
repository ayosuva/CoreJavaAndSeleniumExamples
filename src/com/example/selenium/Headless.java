package com.example.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("headless");
        options.setHeadless(true);
        WebDriver driver = new ChromeDriver(options);

        driver.get("http://the-internet.herokuapp.com/iframe");
        String str=driver.findElement(By.tagName("h3")).getText();
        System.out.println(str);
        driver.switchTo().frame("mce_0_ifr");
        driver.findElement(By.tagName("p")).sendKeys("Hello, world!");
        driver.switchTo().defaultContent();
        str=driver.findElement(By.tagName("h3")).getText();
        System.out.println(str);
        Thread.sleep(5000);
        driver.quit();

    }
}
