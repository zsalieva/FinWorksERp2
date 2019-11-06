package com.cybertek.pages.aboutUs;

import com.cybertek.utilities.Driver;
import org.apache.logging.log4j.core.util.JsonUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class AboutUs<options> {

    public  void AboutUsDropDown(){
        PageFactory.initElements(Driver.getDriver(), this);}


    @FindBy(xpath = "//a[contains(text(),'About Us')][1]")
    public WebElement About;


      public  static void ClickOnAboutUs(){
            Driver.driver.findElement(By.xpath( "//a[contains(text(),'About Us')][1]")).click();
      }

      public static List<WebElement> menu() {
          Select dropdown = new Select(Driver.getDriver().findElement(By.xpath("//a[contains(text(),'About Us')][1]")));
          // WebElement select = Driver.getDriver().findElement(By.id("//a[contains(text(),'About Us')][1]"));
          //  List<WebElement> options = select.findElements(By.xpath("//a[contains(text(),'What is ERP?')][1]"));

          List<WebElement> lst = dropdown.getOptions();
          return lst;
      }
}
