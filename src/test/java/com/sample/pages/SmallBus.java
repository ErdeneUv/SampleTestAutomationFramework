package com.sample.pages;

import com.sample.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmallBus extends BasePage{

    public SmallBus(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//a[@id = 'enroll']")
    public WebElement enrollBtn;

    @FindBy(className = "spa-btn_spa-btn--primary_spa-btn--medium_masthead-cta-btn")
    public WebElement applyBtn;

    @FindBy(xpath = "//a[@id = 'finCenterLocator']")
    public WebElement findATM;

}
