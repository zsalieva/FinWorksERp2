package com.cybertek.step_definitions;

import com.cybertek.pages.login_navigation.LoginPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import com.cybertek.utilities.Pages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class LoginStepDefinitions {
    Pages pages = new Pages();

    @Given("user is on the landing page")
    public void user_is_on_the_landing_page() {
        pages.loginPage().goToLandingPage();
    }

    @Then("user logs in as a helpdesk")
    public void user_logs_in_as_a_helpdesk() {
        String username = ConfigurationReader.getProperty("helpdeskusername");
        String password = ConfigurationReader.getProperty("helpdeskpassword");
        pages.loginPage().login(username, password);
    }

    @Then("user verifies that {string} page name is displayed")
    public void user_verifies_that_page_name_is_displayed(String expected) {
        Assert.assertEquals(expected, Driver.getDriver().getTitle());
    }

    @Then("user quits")
    public void user_quits() {
        Driver.closeDriver();
    }

    @Then("user logs in with {string} username and {string} password")
    public void user_logs_in_with_username_and_password(String string, String string2) {
        pages.loginPage().login(string, string2);
    }

    @Then("user logs in as a marketing")
    public void user_logs_in_as_a_marketing() {
        String username = ConfigurationReader.getProperty("marketingusername");
        String password = ConfigurationReader.getProperty("marketingpassword");
        pages.loginPage().login(username, password);
    }

    @Then("user logs in as a hr")
    public void user_logs_in_as_a_hr() {
        String username = ConfigurationReader.getProperty("hrusername");
        String password = ConfigurationReader.getProperty("hrpassword");
        pages.loginPage().login(username, password);
    }

    private LoginPage loginPage;

    public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

}