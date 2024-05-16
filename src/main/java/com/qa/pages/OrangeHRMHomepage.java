package com.qa.pages;

import org.openqa.selenium.By;

import com.qa.enums.WaitStrategy;

public final class OrangeHRMHomepage extends BasePage {

	private final By userDropdoneIcon = By.xpath("//p[@class='oxd-userdropdown-name']/following-sibling::i");
	private final By logoutLink = By.linkText("Logout");

	public OrangeHRMHomepage clickuUserDropdoneIcon() {
		click(userDropdoneIcon, WaitStrategy.CLICKABLE);
		return this;
	}

	public OrangeHRMLoginPage clickLogoutLink() {
		click(logoutLink , WaitStrategy.CLICKABLE);
		return new OrangeHRMLoginPage();
	}
}
