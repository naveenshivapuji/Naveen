package com.actiTimeFramework.login.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
	@FindBy(xpath = "//div[@class ='popup_menu_icon support_icon']")
	WebElement homeHelpBtn;

	public Home(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void helpButton() {
		homeHelpBtn.click();
	}
}
