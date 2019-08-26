package com.cybertek.step_definitions;

import com.cybertek.pages.Navigation.NavigationPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import com.cybertek.utilities.Pages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.sql.SQLOutput;
import java.util.Map;

public class NavigationStepDefinitions {
    Pages pages = new Pages();
    @Given("I log in as a {string}")
    public void i_log_in_as_a(String role) {
        pages.loginPage().login(role);
        System.out.println("As a " + role);
    }




    @When("I click a {string}")
    public void i_click_a(String module) {
     pages.navigationPage().navigateTo(module);
       System.out.println("navigate to " + module);



    }

    @Then("the title should be {string}")
    public void the_title_should_be(String string) {
        BrowserUtils.waitPlease(3);
        String actual = Driver.driver.getTitle();
        Assert.assertEquals(string,actual);
    }
}
