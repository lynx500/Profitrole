package com.rhcloud.profiterole.features;

import com.rhcloud.profiterole.steps.LoginSteps;
import com.rhcloud.profiterole.util.PropertyLoader;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
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

    PropertyLoader props = new PropertyLoader();

    @Test
    public void shouldLoginToTheAccount() throws Exception {
//        loginPageSteps.login("nikedrummer", "123456");
        loginPageSteps.login(props.loadProperty("login"), props.loadProperty("password"));
        loginPageSteps.checkTextOnLogoutLink("Выход");
        loginPageSteps.checkTextOnProfileLink("Профиль");
    }

    @Test
    public void shouldReturnMessageIncorrectLogin() {
        loginPageSteps.login("nika", "123456");
        loginPageSteps.checkMessageIncorrectLogin("Вы ввели неверный логин и/или пароль");
    }

    @Test
    public void shouldReturnMessageIncorrectLoginAfterEmptyInput() {
        loginPageSteps.login("", "");
        loginPageSteps.checkMessageIncorrectLogin("Вы ввели неверный логин и/или пароль");
    }
}
