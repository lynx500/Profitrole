package com.rhcloud.profiterole.features;

import com.rhcloud.profiterole.steps.RecipesSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class RecipesStory {

    @Managed
    WebDriver webDriver;

    @ManagedPages
    Pages pages;

    @Steps
    RecipesSteps recipesSteps;

    @Test
    public void shouldOpenJapaneseCuisine() {
        recipesSteps.openRecipesPage();
        recipesSteps.openJapaneseCuisine();
        recipesSteps.checkCuisineHeadline("Японская кухня");
    }
}
