package com.cybertek.step_definitions;

import com.cybertek.pages.aboutUs.AboutUs;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AboutUsStepDefinitions {





    @Given("user is on the landing page")
    public void user_is_on_the_landing_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user clicks on AboutUs")
    public void user_clicks_on_AboutUs() {
       AboutUs.ClickOnAboutUs();
    }

    @Then("user should able to see {string}")
    public void user_should_able_to_see(String string) {

        AboutUs.menu().contains(string);
       // AboutUs.menu().get(1).equals(string);

    }





}
