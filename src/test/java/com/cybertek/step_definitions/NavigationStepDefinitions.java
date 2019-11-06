package com.cybertek.step_definitions;

import com.cybertek.pages.Navigation.NavigationPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class NavigationStepDefinitions {


    @Given("user is on the landing page")
    public void user_is_on_the_landing_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }


    @When("user clicks on {string}")
    public void user_clicks_on(String string) {
        NavigationPage.navigato(string);
        BrowserUtils.waitPlease(3);
    }

    @Then("the {string} should be displayed")
    public void the_should_be_displayed(String string) {

         String actual = Driver.driver.getTitle();
         Assert.assertTrue(actual.contains(string));
       // Assert.assertEquals(string,actual);
        BrowserUtils.waitPlease(3);
    }




}
