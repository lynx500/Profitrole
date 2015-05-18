package com.rhcloud.profiterole.features;

import com.rhcloud.profiterole.steps.RegistrationSteps;
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
public class RegistrationStory {

    @Managed
    WebDriver webDriver;

    @ManagedPages
    Pages pages;

    @Steps
    RegistrationSteps registrationSteps;

    @Test
    public void shouldReturnMessageFillRequiredData() {
        registrationSteps.openRegistrationPage();
        registrationSteps.clickBtnRegister();
        registrationSteps.checkMessageEmptyEmail("Поле не должно быть пустым.");
        registrationSteps.checkMessageTickAmAgree("Для завершения регистрации Вы должны принять Правила и условия работы на сайте.");
    }

    @Test
    @Ignore
    public void shouldRegisterTheUser() {
        registrationSteps.openRegistrationPage();
        registrationSteps.fillOutRequiredFields("test", "123456", "ghfh24487@haqed.com");
        registrationSteps.setGenderMale();
        registrationSteps.setCountry("Германия");
        registrationSteps.clickBtnRegister();
        registrationSteps.checkMessageSuccessfulRegistration("Регистрация прошла успешно");
    }
}
