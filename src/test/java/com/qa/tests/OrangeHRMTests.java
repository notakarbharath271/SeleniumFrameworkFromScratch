package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.pages.OrangeHRMHomepage;
import com.qa.pages.OrangeHRMLoginPage;

public final class OrangeHRMTests extends BaseTest{
	
	
	private OrangeHRMTests() {
		
	}
	
	@Test
	public void LoginLogoutTest() {
		OrangeHRMLoginPage hrmLoginPage = new OrangeHRMLoginPage();
		
		OrangeHRMHomepage homepage = hrmLoginPage.enterUserName("Admin").enterPassword("admin123").clickLogin();
		homepage.clickuUserDropdoneIcon().clickLogoutLink();
	}

}
