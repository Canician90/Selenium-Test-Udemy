package org.example;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppConfig {
    private static Properties properties = new Properties();
    static  {
        String enviroment =System.getProperty("env", "production");


        InputStream inputStream = AppConfig.class.getClassLoader().getResourceAsStream(enviroment + ".properties");
        try {
            properties.load(inputStream);
        } catch (IOException e) {

            System.out.println("Failed to load properties from configuration file");
        }
    }


    private static  String chromeDriverPath =properties.getProperty("chrome.driver.path");
    private static  String geckorDriverPath  =properties.getProperty("gecko.driver.pathh");
    private static  String siteUrl =properties.getProperty("site.url");

    public static String getChromeDriverPath() {
        return chromeDriverPath;
    }

    public static String getGeckorDriverPath() {
        return geckorDriverPath;
    }

    public static String getSiteUrl() {
        return siteUrl;
    }
}