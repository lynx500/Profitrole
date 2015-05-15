package com.rhcloud.profiterole.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://gioia-profiterole.rhcloud.com/menu")
public class MenuOnDayPage extends PageObject {

    @FindBy(xpath = "//button[@value='#breakfast']")
    private WebElementFacade btnBreakfast;

    @FindBy(css = "h1")
    private WebElementFacade leftHeadline;

    @FindBy(css = "#menu-header > h1")
    private WebElementFacade rightHeadline;

    @FindBy(xpath = "//*[@id='cuisine']/div[1]")
    private WebElementFacade ukrCuisine;

    @FindBy(id = "back")
    private WebElementFacade btnBack;

    @FindBy(xpath = "//div[@id='cuisine']/div[22]/div[3]/label")
    private WebElementFacade sandwich;

    @FindBy(id = "myModalLabel")
    private WebElementFacade modalRecipeWindow;

    public void clickBtnBreakfast() {
        btnBreakfast.click();
    }

    public void clickBtnBack() {
        btnBack.click();
    }

    public String getLeftHeadline() {
        return leftHeadline.getText();
    }

    public String getRightHeadline() {
        return rightHeadline.getText();
    }

    public void clickUkrCuisine() {
        ukrCuisine.click();
    }

    public void clickSandwich() {
        sandwich.click();
    }

    public String getHeadlineInModalRecipeWindow() {
        return modalRecipeWindow.getText();
    }

    public void waitForBackBtn() {
        waitForRenderedElements(By.id("back"));
    }
}
