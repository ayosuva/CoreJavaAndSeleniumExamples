package com.example.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class CookiesExample {
    public static void main(String[] args) {
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
        // Add cookie
        driver.manage().addCookie(new Cookie("ssid", "ssid-42423"));
        // Get cookie details with named cookie 'foo'
        Cookie cookie1 = driver.manage().getCookieNamed("ssid");
        System.out.println(cookie1);
        // Get All available cookies
        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println(cookies);
        // delete a cookie with name 'test1'
        driver.manage().deleteCookieNamed("ssid");
        // deletes all cookies
        driver.manage().deleteAllCookies();
        driver.quit();

    }
}
