package com.cybertek.pages.activity_stream;


import com.cybertek.utilities.Driver;
import com.cybertek.utilities.Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasksPage {
    public TasksPage(){
        PageFactory.initElements(Driver.getDriver(), this);}
    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-tasks']//span[contains(text(),'Task')]")
    @CacheLookup
    public WebElement tasksTop;

    @FindBy(id = "//*[@id=\"bx-component-scope-lifefeed_task_form\"]/div/div[1]/div[1]/div[2]/input")
    @CacheLookup
    public WebElement thingsToDo;


    @FindBy(id = "blog-submit-button-save")
    @CacheLookup
    public WebElement task_submit;

    public void clickTask(){

    tasksTop.click();
     }
     public void setThingsToDo(String things){
         thingsToDo.sendKeys();
     }
     public void clickSubmit(){
        task_submit.click();
     }


}
