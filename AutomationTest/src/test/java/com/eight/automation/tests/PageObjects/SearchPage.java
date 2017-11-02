package com.eight.automation.tests.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by venpatis on 26/10/2017.
 */
public class SearchPage {
    public WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchString;

    @FindBy(className = "nav-input")
    public WebElement submitSearch;

    @FindBy(id = "searchDropdownBox")
    public WebElement searchFilter;

    @FindBy(xpath = ".//*[@id='result_0']/div/div[3]/div/div[2]/div/div/div[2]/div[1]/div[1]/a/h2")
    public WebElement results;


    @FindBy(xpath = ".//*[@id='add-to-cart-button']")
    public WebElement addToCart;

    public SearchPage enterBookName(String bookName) {
        searchString.sendKeys(bookName);

        return PageFactory.initElements(driver, SearchPage.class);
    }

    String parent;
    public SearchPage SelectFirst() {

        driver.findElement(By.linkText("Charlie Cook's Favorite Book")).click();
         parent = driver.getWindowHandle();
        return PageFactory.initElements(driver, SearchPage.class);
    }

    public SearchPage search() {
        submitSearch.click();
        return PageFactory.initElements(driver, SearchPage.class);
    }


    public SearchPage searchByCategoryBooks() {
        Select select = new Select(searchFilter);
        select.selectByVisibleText("Books");
        return PageFactory.initElements(driver, SearchPage.class);
    }



    String parentWindowHandle;
    public void addToCart() {
              addToCart.click();

    }
}
