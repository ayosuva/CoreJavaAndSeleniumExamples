package com.example.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        Alert alert= driver.switchTo().alert();
        String alertText=alert.getText();
        System.out.println(alertText);
        InteractionsAndNavigations.wait(2000);
        alert.accept();
        InteractionsAndNavigations.wait(2000);
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        alert= driver.switchTo().alert();
        alertText=alert.getText();
        System.out.println(alertText);
        InteractionsAndNavigations.wait(2000);
        alert.dismiss();
        InteractionsAndNavigations.wait(2000);
        driver.quit();


    }
}
