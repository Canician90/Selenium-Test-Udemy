package org.example;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBASE {
    protected WebDriver driver = null;
    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", AppConfig.getChromeDriverPath());


        driver = new ChromeDriver();
    }
    @After
    public void tearDown() {
        driver.quit();
    }



}
