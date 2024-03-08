package com.sample.stepdefs;

import com.sample.pages.SmallBus;
import com.sample.utility.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US_02 extends SmallBus {

    @When("User goes to Small Business tab")
    public void user_goes_to_small_business_tab() {
        smallBusiness.click();
    }
    @Then("User should see enroll button")
    public void user_should_see_enroll_button() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        Assert.assertTrue(enrollBtn.isDisplayed());
    }
    @When("User click on ATM locator")
    public void user_click_on_atm_locator() {
        findATM.click();
    }
    @Then("User should be in {string}")
    public void user_should_be_in(String expectedLink) {
        String actualLink = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedLink, actualLink);
        System.out.println("actualLink = " + actualLink);
    }

}
