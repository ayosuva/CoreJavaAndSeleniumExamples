package com.example.selenium;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractionsAndNavigations {
    public static void main(String[] args) {
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();
        //driver.get("https://www.selenium.dev/");
        /*driver.get("http://the-internet.herokuapp.com/tables");
        *//*Alert a =driver.switchTo().alert();
        a.getText();
        String text=driver.findElement(By.xpath("//td[@class='dues']")).getText();
        List<WebElement> due = driver.findElements(By.xpath("//td[@class='dues']"));
        List<Double> b = new ArrayList();
        for (int i = 0; i < due.size(); i++) {
            b.add(Double.parseDouble(due.get(i).getText().replace("$", "")));
        }*/
        driver.get("https://yosuva.com/TestLogin.html");
        //driver.navigate().to("url");
        //driver.navigate().refresh();
        driver.findElement(By.id("fname")).sendKeys("Yosuva");
        driver.findElement(By.name("lname")).sendKeys("Arulanthu");
        driver.findElement(By.name("lname")).submit();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().back();
        driver.findElement(By.id("fname")).clear();
        driver.findElement(By.name("lname")).clear();
        //driver.findElement(By.xpath("//input[@value='Submit']")).click();
        driver.findElement(By.linkText("Click Here")).click();
        String getTextValue=driver.findElement(By.linkText("Click Here")).getText();
        System.out.println(getTextValue);
        driver.navigate().back();
        driver.findElement(By.partialLinkText("Click")).click();
        driver.quit();
    }

    public static void wait(int milliseconds){
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
