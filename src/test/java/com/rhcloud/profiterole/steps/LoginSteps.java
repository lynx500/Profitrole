package com.rhcloud.profiterole.steps;

import com.rhcloud.profiterole.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.junit.Assert.assertEquals;

public class LoginSteps extends ScenarioSteps {

    LoginPage loginPage;

    @Step
    public void openLoginPage() {
        loginPage.open();
    }

    @Step
    public void setLogin(String login) {
        loginPage.setLogin(login);
    }

    @Step
    public void setPassword(String password) {
        loginPage.setPassword(password);
    }

    @Step
    public void clickLoginBtn() {
        loginPage.clickLogin();
    }

    @Step
    public void checkMessageIncorrectLogin(String message) {
        assertEquals(message, loginPage.getMessageIncorrectLogin());
    }

    @Step
    public void checkTextOnLogoutLink(String text) {
        assertEquals(text, loginPage.getTextOnLinkLogout());
    }

    @Step
    public void checkTextOnProfileLink(String text) {
        assertEquals(text, loginPage.getTextOnLinkProfile());
    }

    @Step
    public void login(String login, String password) {
        openLoginPage();
        setLogin(login);
        setPassword(password);
        clickLoginBtn();
    }

    @Step
    public void checkHeadline(String headline) {
        assertEquals(headline, loginPage.getHeadline());
    }
}
