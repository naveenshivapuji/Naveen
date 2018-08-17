package com.actiTimeFramework.login.scripts;

import org.testng.annotations.Test;

import com.actiTimeFramework.Generic.BaseTest;
import com.actiTimeFramework.Generic.Lib;
import com.actiTimeFramework.login.pom.Login;

public class TestInvalidLogin extends BaseTest {

	@Test
	public void testInvalidLogin() throws InterruptedException {

		Login lp = new Login(driver);
		int rowCount = Lib.getRowCount("InvalidLogin");
		for (int j = 1; j <= rowCount; j++) {
			String username = Lib.getCellValue("InvalidLogin", j, 0);
			String password = Lib.getCellValue("InvalidLogin", j, 1);
			lp.setUsername(username);
			Thread.sleep(2000);
			lp.setPassword(password);
			Thread.sleep(2000);
			lp.clickLoginBtn();
			Thread.sleep(2000);
		}

	}

}
