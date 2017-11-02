package com.eight.automation.tests.CommonUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
/**
 * Created by venpatis on 26/10/2017.
 */
public class LocalDriverFactory {



    public static WebDriver createInstance(String browserName) {
        WebDriver driver;
        String chromedriverLocation = "chromedriver.exe";
        String iedriverLocation = "IEDriverServer.exe";

        if(browserName==null) {
            Properties prop = new Properties();
            InputStream input = null;
            try {

                String filename = "config.properties";
                input = LocalDriverFactory.class.getClassLoader().getResourceAsStream(filename);
                prop.load(input);
                chromedriverLocation = prop.getProperty("chromedriverLocation");

            } catch (IOException ex) {
            }
        }

                System.setProperty("webdriver.chrome.driver", chromedriverLocation);
                driver = new ChromeDriver();


        driver.manage().window().maximize();
        return driver;
    }


}
