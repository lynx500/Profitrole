package com.rhcloud.profiterole.features;

import com.rhcloud.profiterole.steps.CreateMenuSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CreateMenuStory {

    @Managed
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
    public void shouldOpenDesiredCuisine() {
        createMenuSteps.openBreakfatsPage();
        createMenuSteps.clickUkrCuisine();
        createMenuSteps.checkRightHeadline("Украинская");
    }

    @Test
    @Pending
    public void shouldReturnToTheRecipesTable() {
        createMenuSteps.openUkrCuisine();
        createMenuSteps.clickBack();
        createMenuSteps.checkRightHeadline("Рецепты");
    }

    @Test
    public void shouldOpenWindowWithDesiredRecipe() {
        createMenuSteps.openUkrCuisine();
        createMenuSteps.clickSandwich();
        createMenuSteps.checkHeadlineInModalRecipeWindow("Бутерброд с колбасой");
    }
}
