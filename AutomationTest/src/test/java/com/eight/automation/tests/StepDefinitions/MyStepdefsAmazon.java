package com.eight.automation.tests.StepDefinitions;

import com.eight.automation.tests.CommonUtils.BaseSteps;
import com.eight.automation.tests.PageObjects.SearchPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by venpatis on 26/10/2017.
 */
public class MyStepdefsAmazon extends BaseSteps  {
    SearchPage SearchInamazon;

    @Before("@AmazonOrder")
    public  void setUpcpntext() {
        setupDriver();
    }

    @Given("^I Open \"([^\"]*)\"$")
    public void iOpen(String baseUrl) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.get(getBaseUrl());
        SearchInamazon= PageFactory.initElements(driver, SearchPage.class);
    }


    @When("^I search  for only books$")
    public void iSearchForOnlyBooks() throws Throwable {
        SearchInamazon.searchByCategoryBooks();

    }

    @And("^Seach I  for \"([^\"]*)\"$")
    public void seachIFor(String bookName) throws Throwable {
        SearchInamazon.enterBookName(bookName).search();

    }

    @And("^I added the selected book to the shopping cart$")
    public void iAddedTheSelectedBookToTheShoppingCart() throws Throwable {
      SearchInamazon.SelectFirst().addToCart();

    }
}
