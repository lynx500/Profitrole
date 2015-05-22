package com.rhcloud.profiterole.features;

import com.rhcloud.profiterole.steps.CreateMenuSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CreateMenuStory {

    @Managed(uniqueSession = true)
    WebDriver webDriver;

    @ManagedPages
    Pages pages;

    @Steps
    CreateMenuSteps createMenuSteps;

    @Test
    public void shouldOpenPageWithRequiredHeadlines() {
        createMenuSteps.openBreakfatsPage();
        createMenuSteps.checkLeftHeadline("Ваш завтрак");
        createMenuSteps.checkRightHeadline("Рецепты");
    }

    @Test
    public void shouldOpenWindowWithDesiredRecipe() {
        createMenuSteps.openUkrCuisine();
        createMenuSteps.clickMilk();
        createMenuSteps.checkHeadlineInModalRecipeWindow("Молоко");
    }

    @Test
    public void addBreakfast() {
        createMenuSteps.openUkrCuisine();
        createMenuSteps.dragNDropDishForBreakfast(createMenuSteps.addMilk());
        createMenuSteps.checkDishOnBreakfast();
    }
}
