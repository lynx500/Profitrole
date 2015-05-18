package com.rhcloud.profiterole.features;

import com.rhcloud.profiterole.steps.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginStory {

    @Managed
    WebDriver webDriver;

    @ManagedPages
    Pages pages;

    @Steps
    LoginSteps loginPageSteps;

    @Test
    public void shouldLoginToTheAccount() {
        loginPageSteps.login("nikedrummer", "123456");
        loginPageSteps.checkTextOnLogoutLink("Выход");
        loginPageSteps.checkTextOnProfileLink("Профиль");
    }

    @Test
    public void shouldReturnMessageIncorrectLogin() {
        loginPageSteps.login("nika", "123456");
        loginPageSteps.checkMessageIncorrectLogin("Вы ввели неверный логин и/или пароль");
    }

    @Test
    public void shouldReturnMessageAfterEmptyInput() {
        loginPageSteps.login("", "");
        loginPageSteps.checkMessageIncorrectLogin("Вы ввели неверный логин и/или пароль");
    }
}
