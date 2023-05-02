package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    public static WebDriver getDriver(String browser) {

        WebDriver driver;
        switch (browser) {
            default:
            case "chrome":

        System.setProperty("webdriver.chrome.driver", AppConfig.getChromeDriverPath());


        WebDriver driver = new ChromeDriver();
        break;
        case "firefox":

        System.setProperty("webdriver.gecko.driver", AppConfig.getGeckorDriverPath());


        WebDriver driver = new FirefoxDriver();
        break;





    }

        return driver;



}
}
