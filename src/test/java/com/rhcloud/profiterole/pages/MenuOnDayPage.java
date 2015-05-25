package com.rhcloud.profiterole.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://gioia-profiterole.rhcloud.com/menu")
public class MenuOnDayPage extends PageObject {

    public MenuOnDayPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[@value='#breakfast']")
    private WebElementFacade btnBreakfast;

    @FindBy(css = "h1")
    private WebElementFacade leftHeadline;

    @FindBy(css = "#menu-header > h1")
    private WebElementFacade rightHeadline;

    @FindBy(xpath = "//*[@id='cuisine']/div[contains(.,'Украинская')]")
    private WebElementFacade ukrCuisine;

    @FindBy(xpath = "//*[@id='cuisine']/div[contains(.,'Молоко')]")
    private WebElementFacade milk;

    @FindBy(id = "breakfast")
    private WebElementFacade divBreakfast;

    @FindBy(id = "myModalLabel")
    private WebElementFacade modalRecipeWindow;

    @FindBy(xpath = "//*[@id='breakfast']/div[contains(.,'Молоко')]")
    private WebElementFacade milkOnDivBreakfast;

    public boolean isMilkEnableOnBreakfastPanel() {
        waitForRenderedElements(By.xpath("//*[@id='breakfast']/div[contains(.,'Молоко')]"));
        return milkOnDivBreakfast.isPresent();
    }

    public void clickBtnBreakfast() {
        btnBreakfast.click();
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

    public void clickMilk() {
        milk.click();
    }

    public String getHeadlineInModalRecipeWindow() {
        return modalRecipeWindow.getText();
    }

    public WebElementFacade getMilk() {
        return milk;
    }

    public WebElementFacade getDivBreakfast() {
        return divBreakfast;
    }

    public void dragNDropDishForBreakfast(WebElementFacade dish) {
        new Actions(getDriver()).clickAndHold(dish).moveToElement(getDivBreakfast()).release().perform();
    }
}
