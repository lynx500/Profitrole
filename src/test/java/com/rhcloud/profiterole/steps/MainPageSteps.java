package com.rhcloud.profiterole.steps;

import com.rhcloud.profiterole.pages.ProfitroleMainPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.yecht.Data;


public class MainPageSteps extends ScenarioSteps {

    ProfitroleMainPage profitroleMainPage;

    @Step
    public void clickLoginLink() {
        profitroleMainPage.clickLogin();
    }

    @Step
    public void clickRegistration() {
        profitroleMainPage.clickRegistration();
    }

    @Step
    public void openHomePage() {
        profitroleMainPage.open();
    }

}
