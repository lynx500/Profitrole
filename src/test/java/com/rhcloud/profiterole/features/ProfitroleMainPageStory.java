package com.rhcloud.profiterole.features;

import com.rhcloud.profiterole.steps.EndUserSteps;
import com.rhcloud.profiterole.steps.LoginSteps;
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
public class ProfitroleMainPageStory {

    @Managed
    WebDriver webDriver;

    @ManagedPages
    Pages pages;

    @Steps
    EndUserSteps endUserSteps;
    LoginSteps loginSteps;

    @Test
    @Pending
    public void clickLoginLink() {
        endUserSteps.openHomePage();
        endUserSteps.clickLoginLink();
        loginSteps.checkHeadline("Вход");
    }
}
