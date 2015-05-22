package com.rhcloud.profiterole.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://gioia-profiterole.rhcloud.com/allOfRecipes")
public class RecipesPage extends PageObject {

    @FindBy(xpath = "//*[@id='cuisine']/div[contains(.,'Японская')]")
    public WebElementFacade cuisineJapanese;

    @FindBy(xpath = "//*[@id='menu-header']/h4[contains(.,'Японская')]")
    private WebElementFacade cuisineHeadline;

    public void clickJapaneseCuisine() {
        cuisineJapanese.click();
    }

    public String getCuisineHeadline() {
        return cuisineHeadline.getText();
    }
}
