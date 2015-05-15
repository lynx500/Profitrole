package com.rhcloud.profiterole.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://gioia-profiterole.rhcloud.com/forgotPassword")
public class ForgotPasswordPage extends PageObject {

    @FindBy(id = "email")
    private WebElementFacade fieldEmail;

    @FindBy(css = "button.btn")
    private WebElementFacade btnNext;

    @FindBy(css = "span.error")
    private WebElementFacade msgIncorrectEmail;

    @FindBy(css = "h4")
    private WebElementFacade msgEmailWasSent;

    public void setEmail(String email) {
        fieldEmail.sendKeys(email);
    }

    public void clickNext() {
        btnNext.click();
    }

    public String getMessageIncorrectEmail() {
        return msgIncorrectEmail.getText();
    }

    public String getMessageEmailWasSent() {
        return msgEmailWasSent.getText();
    }
}
