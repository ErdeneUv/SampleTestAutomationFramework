package com.sample.stepdefs;

import com.sample.pages.DD;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class US_04 extends DD {
    Select select;

    @When("User select simple dropdown")
    public void user_select_simple_dropdown() {
        Select select = new Select(simpleDD);


    }
    @Then("User should be able to select 2nd option")
    public void user_should_be_able_to_select_2nd_option() {
        Select select = new Select(simpleDD);
        List<WebElement> options = select.getOptions();
        options.get(1).click();
    }
    @Then("User should be able to select his birthdate")
    public void user_should_be_able_to_select_his_birthdate() {
        Select y = new Select(year);
        y.selectByValue("1945");

        Select m = new Select(month);
        m.selectByIndex(4);

        Select d = new Select(day);
        d.selectByVisibleText("4");


        System.out.println("year.isSelected() = " + year.isSelected());


    }
}
