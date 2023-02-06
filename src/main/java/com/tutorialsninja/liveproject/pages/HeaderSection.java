package com.tutorialsninja.liveproject.pages;

import com.tutorialsninja.liveproject.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderSection {

    public HeaderSection(){
        PageFactory.initElements(Base.driver, this); // every time automatically initialize web elements below
    }

    @FindBy(xpath = "//span[text()=\"My Account\"]")
    public static WebElement myAccountLink;

    @FindBy(linkText="Register")
    public static WebElement register;

}
