package com.solvd.web;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.solvd.lessonweb.HomePage;
import com.solvd.lessonweb.LocationElement;
import com.solvd.lessonweb.SearchBlock;
import com.solvd.lessonweb.ShoppingPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CameraResultTest implements IAbstractTest {

    @Test
    public void test() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();

        LocationElement locationElement = homePage.getLocationElement();
        if (locationElement.isUIObjectPresent()) {
            locationElement.clickDismissButton();
        }

//        homePage.getSearchInput().type("xxx");
        SearchBlock searchBlock = homePage.getSearchBlock();
        searchBlock.typeInSearchInput("samsung");
//        searchBlock.clickSearchButton(); // откроется новая страницв ShoppingPage
        ShoppingPage shoppingPage = searchBlock.clickSearchButton();

        SoftAssert sa = new SoftAssert();

        shoppingPage.getSearchResultBlocks().stream()
                .peek(searchResultBlock -> System.out.println(searchResultBlock.getDescriptionText()))
                        .forEach(searchResultBlock -> sa.assertTrue(searchResultBlock.getDescriptionText().toLowerCase().contains("samsung")));

sa.assertAll();
        System.out.println();
    }

}
