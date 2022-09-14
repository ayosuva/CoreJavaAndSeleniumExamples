package com.example.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;

public class WindowTabExample {
    public static void main(String[] args) {
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().window().minimize();
        //driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //Example 1 with Set and Iterator methods
        driver.get("http://the-internet.herokuapp.com/windows");
        driver.findElement(By.linkText("Click Here")).click();
        Set<String> windows=driver.getWindowHandles();
        Iterator<String> stringIterator= windows.iterator();
        String parentWindow= stringIterator.next();
        String childWindow= stringIterator.next();
        driver.switchTo().window(childWindow);
        System.out.println(driver.findElement(By.tagName("h3")).getText());
        driver.close();
        driver.switchTo().window(parentWindow);
        driver.findElement(By.linkText("Click Here")).click();
        driver.quit();

        //Example 2 with for an for each loop
        driver.get("http://the-internet.herokuapp.com/windows");
        //Store the ID of the original window
        String originalWindow = driver.getWindowHandle();
        //Click the link which opens in a new window
        driver.findElement(By.linkText("Click Here")).click();
        //Wait for the new window or tab
        Wait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(numberOfWindowsToBe(2));
        //Loop through until we find a new window handle
        for (String windowHandle : driver.getWindowHandles()) {
            if(!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        //Loop through until we find a new window handle
        String[] windows1=driver.getWindowHandles().toArray( new String[0]);
        for (int i=0;i<windows1.length;i++) {
            if(!originalWindow.contentEquals(windows1[i])) {
                driver.switchTo().window(windows1[i]);
                break;
            }
        }
        System.out.println(driver.findElement(By.tagName("h3")).getText());
        //Close the tab or window
        driver.close();

        //Switch back to the old tab or window
        driver.switchTo().window(originalWindow);

        // Opens a new tab and switches to new tab
        driver.switchTo().newWindow(WindowType.TAB);

        // Opens a new window and switches to new window
        driver.switchTo().newWindow(WindowType.WINDOW);

    }
}
