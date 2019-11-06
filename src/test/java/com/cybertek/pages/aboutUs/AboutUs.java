package com.cybertek.pages.Navigation;

import com.cybertek.utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AboutUs {

    public  void AboutUsDropDown(){
        PageFactory.initElements(Driver.getDriver(), this);}


    @FindBy(xpath = "//a[contains(text(),'About Us')][1]")
    public WebElement About;

    WebElement element = Driver.driver.findElement(By.xpath( "//a[contains(text(),'About Us')][1]"));
    Select oSelect = new Select(element);
}
