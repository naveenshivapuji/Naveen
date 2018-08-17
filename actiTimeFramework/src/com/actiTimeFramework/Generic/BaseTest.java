package com.actiTimeFramework.Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.internal.annotations.ITest;

public class BaseTest implements IAutoConstant {

	public WebDriver driver;
	static {
		System.setProperty(CHROME_KEY, CHROME_PATH);
//		System.setProperty(GECKO_KEY, GECKO_PATH);
//		System.setProperty(IE_KEY, IE_PATH);
	}
	@BeforeTest
	public void openactiTime() {
		driver = new ChromeDriver();
		String url = Lib.getPropertyValue("URL");
		driver.get(url);
		
		
		//Implicit wait 
		String implicitWait = Lib.getPropertyValue("IMPLICITWAIT");
		long ito = Long.parseLong(implicitWait);
		driver.manage().timeouts().implicitlyWait(ito, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void closeactiTime(ITestResult res) {
		if(ITestResult.FAILURE == res.getStatus()) {
			Lib.captureScreenShot(driver, res.getName());
		}
		}
		@AfterSuite
		public void closeDriver() {
			driver.close();
		}
}
