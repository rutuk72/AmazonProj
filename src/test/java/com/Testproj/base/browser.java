package com.Testproj.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class browser {

    protected WebDriver driver;

    @BeforeTest
    public void setup() throws InterruptedException {
        //chromedriver path
        System.setProperty("webdriver.chrome.driver", "D:\\javapro\\AmezontestProj\\src\\test\\resources\\driver2\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.amazon.in/");




    }

    @AfterMethod
    public void teardown() {
        driver.quit();

    }
}