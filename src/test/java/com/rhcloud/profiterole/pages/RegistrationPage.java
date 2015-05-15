package com.rhcloud.profiterole.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

@DefaultUrl("http://gioia-profiterole.rhcloud.com/registration")
public class RegistrationPage extends PageObject {

    @FindBy(id = "login")
    private WebElementFacade fieldLogin;

    @FindBy(id = "password")
    private WebElementFacade fieldPassword;

    @FindBy(id = "confirmPassword")
    private WebElementFacade fieldConfirmPassword;

    @FindBy(id = "email")
    private WebElementFacade fieldEmail;

    @FindBy(css = "button.btn")
    private WebElementFacade btnRegister;

    @FindBy(id = "maleOrFemale1")
    private WebElementFacade genderFemale;

    @FindBy(id = "maleOrFemale0")
    private WebElementFacade genderMale;

    @FindBy(id = "country")
    private WebElementFacade fieldCountry;

    @FindBy(id = "iAmAgree")
    private WebElementFacade isAgreeBox;

    @FindBy(css = "#emailError > span.error")
    private WebElementFacade msgEmptyEmail;

    @FindBy(css = "#iAmAgreeError > span.error")
    private WebElementFacade msgTickAmAgree;

    @FindBy(css = "h4")
    private WebElementFacade msgSuccessfulRegistration;

    public void setFieldLogin(String login) {
        fieldLogin.sendKeys(login);
    }

    public void setFieldPassword(String password) {
        fieldPassword.sendKeys(password);
    }

    public void setFieldConfirmPassword(String password) {
        fieldConfirmPassword.sendKeys(password);
    }

    public void setFieldEmail(String email) {
        fieldEmail.sendKeys(email);
    }

    public void setCountry(String strCountry) {
        Select country = new Select(fieldCountry);
        country.selectByVisibleText(strCountry);
    }

    public void setGenderFemale() {
        genderFemale.click();
    }

    public void setGenderMale() {
        genderMale.click();
    }

    public void clickIsAgreeBox() {
        isAgreeBox.click();
    }

    public void clickBtnRegister() {
        btnRegister.click();
    }

    public String getMessageEmptyEmail() {
        return msgEmptyEmail.getText();
    }

    public String getMessageTickAmAgree() {
        return msgTickAmAgree.getText();
    }

    public String getMessageSuccessfulRegistration() {
        return msgSuccessfulRegistration.getText();
    }
}
