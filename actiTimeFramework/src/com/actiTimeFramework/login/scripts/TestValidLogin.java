package com.actiTimeFramework.login.scripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.actiTimeFramework.Generic.BaseTest;
import com.actiTimeFramework.Generic.Lib;
import com.actiTimeFramework.login.pom.Login;

public class TestValidLogin extends BaseTest {
	
	@Test
	public void testValidLogin() throws InterruptedException {
		
		Login lp = new Login(driver);
		String username = Lib.getCellValue("ValidLogin", 1, 0);
		String password = Lib.getCellValue("ValidLogin", 1, 1);
		
		lp.setUsername(username);
//		Thread.sleep(3000);
		lp.setPassword(password);
//		Thread.sleep(3000);
		lp.clickLoginBtn();
//		Thread.sleep(2000);
		
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
		
		//Soft assert to check 
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getTitle(), "actiTIME - Enter Time-Track");
//		sa.assertEquals(driver.getTitle(), "lkjhrtyuio");
		sa.assertAll();
		
//		System.out.println("helllo");
	}
}
