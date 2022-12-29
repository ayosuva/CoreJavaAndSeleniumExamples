package com.example.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class RelativeLocatorsEx {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("http://the-internet.herokuapp.com/login");
        driver.findElement(
                RelativeLocator.with(By.tagName("input"))
                .below(By.xpath("//label[@for='username']")))
                .sendKeys("Hello");
        driver.findElement(
                        RelativeLocator.with(By.tagName("input"))
                                .below(By.xpath("//label[@for='password']")))
                .sendKeys("password");

        Thread.sleep(4000);
        driver.quit();
    }
}
