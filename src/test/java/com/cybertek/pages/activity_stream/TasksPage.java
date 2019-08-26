package com.cybertek.pages.activity_stream;


import com.cybertek.utilities.BasePage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class TasksPage extends BasePage {

    @FindBy(xpath = "//span[normalize-space(text())='Tasks']")
    public WebElement tasksTop;

    @FindBy(css = "[data-bx-id='task-edit-title']")
    public WebElement thingsToDo;

    @FindBy(css = "[data-bx-id='task-edit-submit']:nth-of-type(1)")
    public WebElement task_submit;

    @FindBy(css = "[id^='iframe_']")
    public WebElement newTaskFrame;

    @FindBy(css = "#tasks-buttonAdd")
    public WebElement newTask;

    public void clickTasks() {
        BrowserUtils.waitForClickablility(tasksTop, 5);
        tasksTop.click();
    }

    public void clickToAddNewTask() {
        BrowserUtils.waitForClickablility(newTask, 5);
        newTask.click();
    }

    public void setThingsToDo(String things) {
        BrowserUtils.waitForFrameAndSwitchToIt(newTaskFrame);
        thingsToDo.sendKeys(things);
        Driver.getDriver().switchTo().defaultContent();
    }

    public void clickSubmit() {
        BrowserUtils.waitForFrameAndSwitchToIt(newTaskFrame);
        task_submit.click();
        Driver.getDriver().switchTo().defaultContent();
    }


}