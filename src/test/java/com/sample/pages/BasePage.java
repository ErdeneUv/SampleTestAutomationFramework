package com.sample.pages;

import com.sample.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "/html/head/title")
    public WebElement header;

    @FindBy(id = "global-search-button")
    public WebElement searchBtn;

    @FindBy(id = "NAV_PERSONAL")
    public WebElement personalBanking;

    @FindBy(id = "NAV_BUSINESS_ADVANTAGE")
    public WebElement smallBusiness;

    @FindBy(id = "NAV_WEALTH_MANAGEMENT")
    public WebElement wealthElement;





}
