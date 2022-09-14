package com.example.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScreenshotExample {
    public static void main(String[] args) {
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/windows");
        File file= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file,new File("screenshot2.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        WebElement clickHere= driver.findElement(By.linkText("Click Here"));
        file= clickHere.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file,new File("clickhere.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        driver.quit();

    }
}
