package com.solvd.lessonweb;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SearchBlock extends AbstractUIObject {

    @FindBy (id = "twotabsearchtextbox")
    private ExtendedWebElement searchInput;

    @FindBy (id = "nav-search-submit-button")
    private ExtendedWebElement searchButton;

    public SearchBlock(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void typeInSearchInput(String text) {
        searchInput.type(text);
    }

//    public void clickSearchButton() {
//        searchButton.click();
//    }
    public ShoppingPage clickSearchButton() {
        searchButton.click();
        return new ShoppingPage(getDriver());
    }

    public ExtendedWebElement getSearchInput() {
        return searchInput;
    }

    public ExtendedWebElement getSearchButton() {
        return searchButton;
    }
}
