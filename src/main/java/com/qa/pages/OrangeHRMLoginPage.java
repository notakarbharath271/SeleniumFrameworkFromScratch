package com.qa.pages;

import org.openqa.selenium.By;

import com.qa.driver.DriverManager;

public final class OrangeHRMLoginPage {

	
	/*
	 * id
	 * name
	 * class name
	 * link text
	 * partial link text
	 * css or xpath
	 */
	 private final By userNameTextbox = By.name("username");
	 private final By passwordTextbox = By.xpath("//input[@name='password' and @type='password']");
	 private final By loginButton = By.xpath("//button[@type='submit']");
	 
	 public OrangeHRMLoginPage enterUserName(String username) {
		 DriverManager.getDriver().findElement(userNameTextbox).sendKeys(username);
		 return this;
	 }
	 
	 public OrangeHRMLoginPage enterPassword(String password) {
		 DriverManager.getDriver().findElement(passwordTextbox).sendKeys(password);
		 return this;
	 }
	 
	 public OrangeHRMHomepage clickLogin() {
		 DriverManager.getDriver().findElement(loginButton).click();
		 
		 return new OrangeHRMHomepage();
	 }
	 
}
