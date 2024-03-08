package com.sample.stepdefs;

import com.sample.pages.PersonalBanking;
import com.sample.utility.ConfigurationReader;
import com.sample.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US_01 {
    PersonalBanking pb = new PersonalBanking();


    @Given("User is on sample site")
    public void user_is_on_sample_site() {
        Driver.getDriver().get(ConfigurationReader.getProperty("envir"));
    }

     @Given("Click on Personal Banking module")
    public void click_on_personal_banking_module() {
        pb.personalBanking.click();
    }

    @When("User input fake username and password")
    public void i_input_fake_username_and_password() {
        pb.userId.sendKeys("username");
        pb.password.sendKeys("password");
    }

    @When("press on login button")
    public void press_on_login_button() {
        pb.loginBtn.click();
    }

    @Then("I shouldn't login")
    public void i_shouldn_t_login() {
        String expectedMsg = ConfigurationReader.getProperty("header_message");
        String actualMsg = pb.loginHeader.getText();

        Assert.assertEquals(expectedMsg, actualMsg);
    }

}
