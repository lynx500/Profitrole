package com.rhcloud.profiterole.steps;

import com.rhcloud.profiterole.pages.MenuOnDayPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CreateMenuSteps extends ScenarioSteps {

    MenuOnDayPage menuOnDayPage;

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
    public void clickMilk() {
        menuOnDayPage.clickMilk();
    }

    @Step
    public void checkHeadlineInModalRecipeWindow(String headline) {
        assertEquals(headline, menuOnDayPage.getHeadlineInModalRecipeWindow());
    }

    @Step
    public void checkDishOnBreakfast() {
        assertTrue(menuOnDayPage.isMilkEnableOnBreakfastPanel());
    }

    @Step
    public WebElementFacade addMilk() {
        return menuOnDayPage.getMilk();
    }

    @Step
    public void dragNDropDishForBreakfast(WebElementFacade dish) {
        menuOnDayPage.dragNDropDishForBreakfast(dish);
    }
}
