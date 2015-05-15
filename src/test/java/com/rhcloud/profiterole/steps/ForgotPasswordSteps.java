package com.rhcloud.profiterole.steps;

import com.rhcloud.profiterole.pages.ForgotPasswordPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import static org.junit.Assert.assertEquals;

public class ForgotPasswordSteps extends ScenarioSteps {

    ForgotPasswordPage forgotPasswordPage;

    @Step
    public void openForgotPasswordPage() {
        forgotPasswordPage.open();
    }

    @Step
    public void setEmail(String email) {
        forgotPasswordPage.setEmail(email);
    }

    @Step
    public void clickNext() {
        forgotPasswordPage.clickNext();
    }

    @Step
    public void checkMessageIncorrectLogin(String message) {
        assertEquals(message, forgotPasswordPage.getMessageIncorrectEmail());
    }

    @Step
    public void checkMessageEmailWasSent(String message) {
        assertEquals(message, forgotPasswordPage.getMessageEmailWasSent());
    }

    @Step
    public void retrievePassword(String email) {
        openForgotPasswordPage();
        setEmail(email);
        clickNext();
    }
}
