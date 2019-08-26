package com.cybertek.step_definitions;

import com.cybertek.utilities.Pages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.Map;

public class TaskStepDefinitions {
    Pages pages = new Pages();

    @Given("user logs in with following credentials")
    public void user_logs_in_with_following_credentials(Map<String, String> values) {
        System.out.println(values);
        pages.loginPage().login(values.get("username"), values.get("password"));
    }

    @Then("user clicks on task button")
    public void user_clicks_on_task_button() {
        pages.tasksPage().clickTasks();
        pages.tasksPage().clickToAddNewTask();
        pages.tasksPage().setThingsToDo("to do list");
        pages.tasksPage().clickSubmit();
    }
//    @Given("user logs in with following credentials")
//    public void user_logs_in_as_a_store_manager() {
//        String username = ConfigurationReader.getProperty("helpdeskusername");
//        String password = ConfigurationReader.getProperty("helpdeskpassword");
//        pages.loginPage().login(username, password);
//
//
//    }  }
}