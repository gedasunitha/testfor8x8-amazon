package com.eight.automation.tests.Tests;

import com.eight.automation.tests.CommonUtils.BaseSteps;
import com.eight.automation.tests.PageObjects.SearchPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by venpatis on 24/10/2017.
 */
public class FirstTests  extends BaseSteps {

@Before
public  void setUpcpntext() {
    setupDriver();
}

    @Test
    public void test(){
        driver.get(getBaseUrl());
        SearchPage SearchInamazon = PageFactory.initElements(driver, SearchPage.class);
        SearchInamazon.searchByCategoryBooks().enterBookName("Charlie Cook's Favorite Book").search().SelectFirst().addToCart();
}

//@After
//    public void tearDown(){
//    driver.close();;
//
//}
}


