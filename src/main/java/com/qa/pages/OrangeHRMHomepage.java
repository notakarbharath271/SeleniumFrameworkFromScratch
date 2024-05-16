package com.qa.pages;

import org.openqa.selenium.By;

public final class OrangeHRMHomepage extends BasePage {

	private final By userDropdoneIcon = By.xpath("//p[@class='oxd-userdropdown-name']/following-sibling::i");
	private final By logoutLink = By.linkText("Logout");

	public OrangeHRMHomepage clickuUserDropdoneIcon() {
		click(userDropdoneIcon, "clickable");
		return this;
	}

	public OrangeHRMLoginPage clickLogoutLink() {
		click(logoutLink , "clickable");
		return new OrangeHRMLoginPage();
	}
}
