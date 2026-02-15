package com.ilcarro.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "h1")
    WebElement title;

    public HomePage isHomePageTitleDisplayed() {
        assert isElementVisible(title);


        return this;
    }

    @FindBy(css = ".navigation-link:nth-child(6)")
    WebElement loginLink;

    public LoginPage clickOnLoginLink() {
        click(loginLink);
        return new LoginPage(driver);
    }

    public HomePage verifyLinksInNaviBar(String linkText) {
        WebElement link=driver.findElement(By.linkText(linkText));
        Assert.assertTrue(link.isDisplayed());
        return this;
    }



}
