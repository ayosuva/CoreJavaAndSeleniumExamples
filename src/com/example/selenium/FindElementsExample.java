package com.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class FindElementsExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","lib/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://the-internet.herokuapp.com/tables");

        List<WebElement> allEmails= driver.findElements(By.xpath("//tr//td[@class='email']"));
        List<WebElement> fname= driver.findElements(By.xpath("//tr//td[@class='first-name']"));
        List<WebElement> lname= driver.findElements(By.xpath("//tr//td[@class='last-name']"));
        List<WebElement> due= driver.findElements(By.xpath("//tr//td[@class='dues']"));
        List<WebElement> delete= driver.findElements(By.xpath("//tr//td[@class='action']//a[@href='#delete']"));
/*        for (WebElement email : allEmails) {
            System.out.println(email.getText());
        }*/
        for (int i = 0; i < allEmails.size(); i++) {
            System.out.println(allEmails.get(i).getText());
            System.out.println(fname.get(i).getText());
            System.out.println(lname.get(i).getText());
            System.out.println(due.get(i).getText());

        }
        for (int i = 0; i < allEmails.size(); i++) {
                if(fname.get(i).getText().equals("Tim")){
                    delete.get(i).click();
                }

        }

        driver.quit();
    }
}
