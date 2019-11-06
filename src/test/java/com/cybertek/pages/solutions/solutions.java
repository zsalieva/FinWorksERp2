package com.cybertek.pages.solutions;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import static com.cybertek.utilities.Driver.driver;

public class solutions {
    public  void Solutions(){
        PageFactory.initElements(Driver.getDriver(), this);}


    @FindBy(xpath = "//a[contains(text(),'Solutions')][1]")
    public WebElement solutions;

    public static void solutionclick(String str ){
        Driver.driver.findElement(By.xpath("//a[contains(text(),'"+str+"')][1]")).click();
      //  WebElement element = Driver.driver.findElement(By.xpath( "//*[contains(text(),'Supply Chain Management')][1]"));
       // Select oSelect = new Select(element);
    }

}

