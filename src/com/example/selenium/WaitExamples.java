package com.example.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Function;

public class WaitExamples {

    public static void main(String[] args) throws InterruptedException {
        //WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver","lib/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //implicit Wait - Applicable all the findElement/findElements methods
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        //explicit Wait - wait for certain conditions and it will keep on checking
        //Initialize and wait till element(link) became clickable - timeout in 10 seconds
        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.tagName("button")));
        //  Print the first result
        System.out.println(firstResult.getText());
        firstResult.click();

        //FluentWait
        //Waiting 30 seconds for an element to be present on the page, checking
        //for its presence once every 5 seconds.
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(3))
                .ignoring(NoSuchElementException.class);

        WebElement h4 = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                if(driver.findElement(By.xpath("//div[@id='finish']/h4")).isDisplayed())
                {
                    return driver.findElement(By.xpath("//div[@id='finish']/h4"));
                }
                else
                    return null;
            }
        });

        System.out.println(h4.isDisplayed());
        System.out.println(h4.getText());
        driver.quit();

    }
}
