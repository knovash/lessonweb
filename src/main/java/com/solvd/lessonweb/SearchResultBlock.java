package com.solvd.lessonweb;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SearchResultBlock extends AbstractUIObject {

    // . начинаем поиск от контекста в ShoppingPage //*[@data-component-type='s-search-result']
    // //*[@data-component-type='s-search-result']//*[contains(@class, 'title-instructions')]//span[text()]
    @FindBy(xpath = ".//*[contains(@class, 'title-instructions')]//span[text()]")
    private ExtendedWebElement description;

    public SearchResultBlock(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public String getDescriptionText() {
        return description.getText(); //текст из span
    }

    public ExtendedWebElement getDescription() {
        return description;
    }
}
