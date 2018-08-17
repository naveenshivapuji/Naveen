package com.actiTimeFramework.login.scripts;

import org.testng.annotations.Test;

import com.actiTimeFramework.Generic.BaseTest;
import com.actiTimeFramework.login.pom.Home;

public class HelpactiTime extends BaseTest {

	@Test
	public void helpMethod() {
		
		Home help1 = new Home(driver);
		help1.helpButton();
	}
	

}
