package com.example.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InformationExample {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/windows");
        String hrefValue=driver.findElement(By.linkText("Click Here")).getAttribute("href");
        String colorValue=driver.findElement(By.linkText("Click Here")).getCssValue("color");
        System.out.println("href:"+hrefValue+" color: "+colorValue);
        if(driver.findElement(By.linkText("Click Here")).isDisplayed())
        {
            System.out.println("Displayed");
        }
        else
        {
            System.out.println("Not Displayed");
        }

        driver.get("http://the-internet.herokuapp.com/dropdown");
        WebElement webElement=driver.findElement(By.id("dropdown"));
        Select sel=new Select(webElement);
        sel.selectByIndex(1);
        sel.selectByValue("2");
        sel.selectByVisibleText("Option 1");

        System.out.println(driver.findElement(By.xpath("//option[@value='1']")).isSelected());
        System.out.println(driver.findElement(By.xpath("//option[1]")).isEnabled());
        driver.quit();

    }
}
