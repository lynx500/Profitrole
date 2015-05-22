package com.rhcloud.profiterole.steps;

import com.rhcloud.profiterole.pages.RecipesPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.junit.Assert.assertEquals;

public class RecipesSteps extends ScenarioSteps {

    RecipesPage recipesPage;

    @Step
    public void openRecipesPage() {
        recipesPage.open();
    }

    @Step
    public void openJapaneseCuisine() {
        recipesPage.clickJapaneseCuisine();
    }

    @Step
    public void checkCuisineHeadline(String headline) {
        assertEquals(headline, recipesPage.getCuisineHeadline());
    }
}
