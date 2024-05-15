package com.qa.pages;

import org.openqa.selenium.By;

import com.qa.driver.DriverManager;

public final class OrangeHRMHomepage {

	private final By userDropdoneIcon = By.xpath("//p[@class='oxd-userdropdown-name']/following-sibling::i");
	private final By logoutLink = By.linkText("Logout");

	public OrangeHRMHomepage clickuUserDropdoneIcon() {
		DriverManager.getDriver().findElement(userDropdoneIcon).click();
		return this;
	}

	public OrangeHRMLoginPage clickLogoutLink() {
		DriverManager.getDriver().findElement(logoutLink);
		return new OrangeHRMLoginPage();
	}
}
