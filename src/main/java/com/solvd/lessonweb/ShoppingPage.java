package com.solvd.lessonweb;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ShoppingPage extends AbstractPage {

    // . точки нет потому что от начала пэйджи
    @FindBy(xpath = "//*[@data-component-type='s-search-result']")
    private List<SearchResultBlock> searchResultBlocks;

    public ShoppingPage(WebDriver driver) {
        super(driver);
    }

    public List<SearchResultBlock> getSearchResultBlocks() {
        return searchResultBlocks;
    }
}
