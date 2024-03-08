package com.sample.pages;

import com.sample.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Check {
    public Check(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='checkbox1']")
    public WebElement check1;

    @FindBy(xpath = "//input[@name='checkbox2']")
    public WebElement check2;
}
