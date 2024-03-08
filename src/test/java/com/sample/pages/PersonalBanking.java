package com.sample.pages;

import com.sample.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalBanking extends BasePage {

    public PersonalBanking(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "NAV_PERSONAL")
    public WebElement checking;

    @FindBy(xpath = "//input[@name='onlineId1']")
    public WebElement userId;

    @FindBy(xpath = "//input[@name='passcode1']")
    public WebElement password;

    @FindBy(id = "signIn")
    public WebElement loginBtn;

    @FindBy(xpath = "//h1[.='Forgot User ID & Password']")
    public WebElement loginHeader;

}
