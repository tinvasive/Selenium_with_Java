package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Iterator;
import java.util.Set;


public class SeleniumTest {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();

        driver = new ChromeDriver(options);

        driver.get("https://www.selenium./");
        driver.manage().window().maximize();

        ((JavascriptExecutor)driver).executeScript("window.open('https://www.instagram.com/'),'_blank'");
        Set<String> windowHandels = driver.getWindowHandles();
        Iterator<String> iterator = windowHandels.iterator();
        String firsttab = iterator.next();
        String secandtab = iterator.next();
        driver.switchTo().window(secandtab);
        Thread.sleep(5000);
        driver.switchTo().window(firsttab);

    }
}
