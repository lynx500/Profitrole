package com.rhcloud.profiterole.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://gioia-profiterole.rhcloud.com/login")
public class LoginPage extends PageObject {

    @FindBy(css = "h2")
    private WebElementFacade headline;

    @FindBy(id = "j_username")
    private WebElementFacade fieldLogin;

    @FindBy(id = "j_password")
    private WebElementFacade fieldPassword;

    @FindBy(css = "button.btn")
    private WebElementFacade btnLogin;

    @FindBy(id = "passwordOrLoginError")
    private WebElementFacade msgIncorrectLogin;

    @FindBy(linkText = "Выход")
    private WebElementFacade linkLogout;

    @FindBy(linkText = "Профиль")
    private WebElementFacade linkProfile;

    public String getHeadline() {
        return headline.getText();
    }

    public void setLogin(String login) {
        fieldLogin.sendKeys(login);
    }

    public void setPassword(String password) {
        fieldPassword.sendKeys(password);
    }

    public void clickLogin() {
        btnLogin.click();
    }

    public String getMessageIncorrectLogin() {
        return msgIncorrectLogin.getText();
    }

    public String getTextOnLinkLogout() {
        return linkLogout.getText();
    }

    public String getTextOnLinkProfile() {
        return linkProfile.getText();
    }
}
