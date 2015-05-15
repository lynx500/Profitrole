package com.rhcloud.profiterole.steps;

import com.rhcloud.profiterole.pages.MenuOnDayPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import java.io.StringReader;

import static org.junit.Assert.assertEquals;

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
    public void clickBack() {
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
}