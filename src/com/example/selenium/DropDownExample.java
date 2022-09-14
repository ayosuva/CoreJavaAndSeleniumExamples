package com.example.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {
    public static void main(String[] args) {
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/dropdown");
        WebElement webElement=driver.findElement(By.id("dropdown"));
        Select sel=new Select(webElement);
        sel.selectByIndex(1);
        sel.selectByValue("2");
        sel.selectByVisibleText("Option 1");

        driver.quit();

    }
}
