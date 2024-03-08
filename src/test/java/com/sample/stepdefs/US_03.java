package com.sample.stepdefs;

import com.sample.pages.Check;
import com.sample.utility.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US_03 extends Check {

    @When("user is on the page")
    public void user_is_on_the_page() {
        String expectedTitle = "Checkboxes";
        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());
    }
    @Then("check if check {int} is not clicked")
    public void check_if_check_is_not_clicked(Integer int1) {
        Assert.assertTrue(!check1.isSelected());
    }
    @Then("check if check {int} is clicked")
    public void check_if_check_is_clicked(Integer int1) {
        Assert.assertTrue(check2.isSelected());
    }

}
