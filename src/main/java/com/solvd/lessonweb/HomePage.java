package com.solvd.lessonweb;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

//    @FindBy(id = "twotabsearchtextbox")
//    private ExtendedWebElement searchInput;

    @FindBy(id = "nav-search-bar-form")
    private SearchBlock searchBlock;

//    @FindBy(xpath = "//*[@data-toaster-type and .//*[contains(text(), 'Shopping Transition')]]//input[@data-action-type='DISMISS']")
//    private ExtendedWebElement dismissLocationButton;

    @FindBy(xpath = "//*[@data-toaster-type and .//*[contains(text(), 'Shopping Transition')]]")
    private LocationElement locationElement;

    public HomePage(WebDriver driver) {
        super(driver);
        setPageURL("/");
    }

    public SearchBlock getSearchBlock() {
        return searchBlock;
    }

    public LocationElement getLocationElement() {
        return locationElement;
    }
}
