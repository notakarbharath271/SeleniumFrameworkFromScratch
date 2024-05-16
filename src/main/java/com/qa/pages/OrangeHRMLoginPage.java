package com.qa.pages;

import org.openqa.selenium.By;

public final class OrangeHRMLoginPage extends BasePage {

	/*
	 * id name class name link text partial link text css or xpath
	 */
	private final By userNameTextbox = By.name("username");
	private final By passwordTextbox = By.xpath("//input[@name='password' and @type='password']");
	private final By loginButton = By.xpath("//button[@type='submit']");

	public OrangeHRMLoginPage enterUserName(String username) {
		sendKeys(userNameTextbox, username, "present");
		return this;
	}

	public OrangeHRMLoginPage enterPassword(String password) {
		sendKeys(passwordTextbox, password, "present");
		return this;
	}

	public OrangeHRMHomepage clickLogin() {
		click(loginButton,"clickable");
		return new OrangeHRMHomepage();
	}

	public String getTitleOrangeHRM() {
		return getPageTitle();

	}

}
