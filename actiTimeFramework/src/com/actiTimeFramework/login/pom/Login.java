package com.actiTimeFramework.login.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	// Declaration
	@FindBy(id = "username")
	WebElement TMusername;

	@FindBy(name = "pwd")
	WebElement TMpassword;

	@FindBy(xpath = "//div[text() = 'Login ']")
	WebElement TMloginBtn;

	// Initialization
	public Login(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

	// Utilization
	public void setUsername(String username) {
		TMusername.sendKeys(username);
	}

	public void setPassword(String password) {
		TMpassword.sendKeys(password);
	}

	public void clickLoginBtn() {

		TMloginBtn.click();
	}

}
