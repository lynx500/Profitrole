package com.rhcloud.profiterole.steps;

import com.rhcloud.profiterole.pages.MenuOnDayPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.StringReader;

import static org.junit.Assert.assertEquals;

public class CreateMenuSteps extends ScenarioSteps {

    MenuOnDayPage menuOnDayPage;

//    @Managed
//    WebDriver webDriver;

    @Step
    public void openMenuOnDayPage() {
        menuOnDayPage.open();
    }

    @Step
    public void clickBreakfast() {
        menuOnDayPage.clickBtnBreakfast();
    }

    @Step
    public void clickUkrCuisine() {
        menuOnDayPage.clickUkrCuisine();
    }

    @Step
    public void clickBack() {
        menuOnDayPage.waitForBackBtn();
        menuOnDayPage.clickBtnBack();
    }

    @Step
    public void checkLeftHeadline(String headline) {
        assertEquals(headline, menuOnDayPage.getLeftHeadline());
    }

    @Step
    public void checkRightHeadline(String headline) {
        assertEquals(headline, menuOnDayPage.getRightHeadline());
    }

    @Step
    public void openBreakfatsPage() {
        openMenuOnDayPage();
        clickBreakfast();
    }

    @Step
    public void openUkrCuisine() {
        openBreakfatsPage();
        clickUkrCuisine();
    }

    @Step
    public void clickSandwich() {
        menuOnDayPage.clickSandwich();
    }

    @Step
    public void checkHeadlineInModalRecipeWindow(String headline) {
        assertEquals(headline, menuOnDayPage.getHeadlineInModalRecipeWindow());
    }

    @Step
    public void waitForBackButton() {
        menuOnDayPage.waitForBackBtn();
    }

    @Step
    public WebElementFacade getDivBreakfast() {
       return menuOnDayPage.getDivBreakfast();
    }

    @Step
    public WebElementFacade getSandwich() {
        return menuOnDayPage.getSandwich();
    }

    @Step
    public void clickDiv() {
        menuOnDayPage.clickDiv();
    }

    @Step
    public void dragNDrop() {
        menuOnDayPage.dragNDrop();
    }
}
