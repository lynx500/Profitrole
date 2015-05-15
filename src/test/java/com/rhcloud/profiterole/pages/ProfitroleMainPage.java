package com.rhcloud.profiterole.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://gioia-profiterole.rhcloud.com")
public class ProfitroleMainPage extends PageObject {

    @FindBy(linkText = "Вход")
    private WebElementFacade linkLogin;

    @FindBy(linkText = "Регистрация")
    private WebElementFacade linkRegistration;

    public void clickLogin() {
        linkLogin.click();
    }

    public void clickRegistration() {
        linkRegistration.click();
    }

}
