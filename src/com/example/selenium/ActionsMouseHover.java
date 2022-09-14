package com.example.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMouseHover {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/hovers");

        WebElement avatar=driver.findElement(By.xpath("(//img[@alt='User Avatar'])[1]"));
        new Actions(driver).moveToElement(avatar).perform();
        InteractionsAndNavigations.wait(5000);
        driver.quit();
    }
}
