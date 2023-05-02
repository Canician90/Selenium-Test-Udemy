package org.example;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBASE {
    protected WebDriver driver = null;

    @Before
    public void setup() {
        String browser = System.getProperty("browser","chrome");
        driver =DriverFactory.getDriver();
    }
    @After
    public void tearDown() {
        driver.quit();
    }



}
