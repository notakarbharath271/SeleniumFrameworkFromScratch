package com.qa.tests;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import com.qa.pages.OrangeHRMLoginPage;

public final class OrangeHRMTests extends BaseTest{
	
	
	private OrangeHRMTests() {
		
	}
	
	@Test
	public void LoginLogoutTest() {
				
		String titleOrangeHRM = new OrangeHRMLoginPage().enterUserName("Admin").enterPassword("admin123").clickLogin().
		clickuUserDropdoneIcon().clickLogoutLink().getTitleOrangeHRM();
		
		Assertions.assertThat(titleOrangeHRM).isEqualTo("OrangeHRM");
	}

}
