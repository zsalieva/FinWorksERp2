package com.cybertek.pages.activity_stream;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class TasksPage {


    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-tasks']//span[contains(text(),'Task')]")
    @CacheLookup
    public WebElement tasksTop;

    @FindBy(id = "task-edit-title")
    @CacheLookup
    public WebElement thingsToDo;


    @FindBy(id = "blog-submit-button-save")
    @CacheLookup
    public WebElement task_submit;

    public void clickTask(){

    tasksTop.click();
     }
     public void setThingsToDo(String things){
         thingsToDo.sendKeys(things);
     }
     public void clickSubmit(){
        task_submit.click();
     }


}
