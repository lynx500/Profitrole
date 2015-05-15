package com.rhcloud.profiterole.steps;

import com.rhcloud.profiterole.pages.RegistrationPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import static org.junit.Assert.assertEquals;

public class RegistrationSteps extends ScenarioSteps {

    RegistrationPage registrationPage;

    @Step
    public void openRegistrationPage() {
        registrationPage.open();
    }

    @Step
    public void setFieldLogin(String login) {
        registrationPage.setFieldLogin(login);
    }

    @Step
    public void setFieldPassword(String password) {
        registrationPage.setFieldPassword(password);
    }

    @Step
    public void setFieldConfirmPassword(String password) {
        registrationPage.setFieldConfirmPassword(password);
    }

    @Step
    public void setFieldEmail(String email) {
        registrationPage.setFieldEmail(email);
    }

    @Step
    public void setCountry(String strCountry) {
        registrationPage.setCountry(strCountry);
    }

    @Step
    public void setGenderFemale() {
        registrationPage.setGenderFemale();
    }

    @Step
    public void setGenderMale() {
        registrationPage.setGenderMale();
    }

    @Step
    public void clickIsAgreeBox() {
        registrationPage.clickIsAgreeBox();
    }

    @Step
    public void clickBtnRegister() {
        registrationPage.clickBtnRegister();
    }

    @Step
    public void checkMessageEmptyEmail(String message) {
        assertEquals(message, registrationPage.getMessageEmptyEmail());
    }

    @Step
    public void checkMessageTickAmAgree(String message) {
        assertEquals(message, registrationPage.getMessageTickAmAgree());
    }

    @Step
    public void checkMessageSuccessfulRegistration(String message) {
        assertEquals(message, registrationPage.getMessageSuccessfulRegistration());
    }

    @Step
    public void fillOutRequiredFields(String login, String password, String email) {
        setFieldLogin(login);
        setFieldPassword(password);
        setFieldConfirmPassword(password);
        setFieldEmail(email);
        clickIsAgreeBox();
    }
}
