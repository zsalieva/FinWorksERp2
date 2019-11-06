package com.cybertek.step_definitions;

import com.cybertek.pages.Navigation.NavigationPage;
import com.cybertek.pages.solutions.solutions;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class solutionsStepDefinitions {
    @Given("user is on the landing page")
    public void user_is_on_the_landing_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user clicks on {string}")
    public void user_clicks_on(String string) {
       solutions.solutionclick(string);
        BrowserUtils.waitPlease(3);
    }

    @Then("user should able to see following menus:")
    public void user_should_able_to_see_following_menus(List<String>menus) {
        System.out.println(menus);
        System.out.println(menus.size());

    }



}
