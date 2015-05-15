package com.rhcloud.profiterole.features;

import com.rhcloud.profiterole.steps.ForgotPasswordSteps;
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
public class ForgotPasswordStory {

    @Managed
    WebDriver webDriver;

    @ManagedPages
    Pages pages;

    @Steps
    ForgotPasswordSteps forgotPasswordSteps;

    @Test
    @Ignore
    public void shouldSentPasswordToTheEmail() {
        forgotPasswordSteps.retrievePassword("whj12403@haqed.com");
        forgotPasswordSteps.checkMessageEmailWasSent("На Ваш Email отправлено сообщение со ссылкой для восстановления пароля.");
    }

    @Test
    @Ignore
    public void shouldReturnErrorIncorrectEmail() {
        forgotPasswordSteps.retrievePassword("dfgd@dfg.dg");
        forgotPasswordSteps.checkMessageIncorrectLogin("Пользователь с данным e-mail адрессом не зарегистрирован.");
    }

    @Test
    @Ignore
    public void shouldReturnErrorEmptyEmail() {
        forgotPasswordSteps.retrievePassword("");
        forgotPasswordSteps.checkMessageIncorrectLogin("Поле не должно быть пустым.");
    }
}
