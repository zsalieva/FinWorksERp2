package com.cybertek.pages.Navigation;

import com.cybertek.step_definitions.Hook;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationPage  {
    public NavigationPage(){
        PageFactory.initElements(Driver.getDriver(), this);}



   public void navigateTo(String module){
     BrowserUtils.waitPlease(3);
     String m ="//span[contains(text(),'" + module + "')]";
     Driver.driver.findElement(By.xpath(m)).click();
    // String tActual = Driver.driver.getTitle();

     }










}
