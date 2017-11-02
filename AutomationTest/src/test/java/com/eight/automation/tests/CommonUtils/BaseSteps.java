package com.eight.automation.tests.CommonUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by venpatis on 26/10/2017.
 */

public class BaseSteps {

    public WebDriver driver;
    private String baseURL="http://www.amazon.com";

    public String getBaseUrl() {
        return  baseURL;
    }


    public void setupDriver() {
        driver = DriverManager.getDriver();
    }

    public void reloadPage() {
        driver.navigate().refresh();
    }



    public static WebElement waitUtilClickable(WebDriver driver, int waitSeconds, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, waitSeconds);
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }


}
