package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.driver.DriverManager;
import com.qa.enums.WaitStrategy;
import com.qa.factories.ExpliclitWaitFactory;

public class BasePage {

	protected void click(By by, WaitStrategy waitStrategy) {

		WebElement element = ExpliclitWaitFactory.performExpliclitWait(waitStrategy, by);
		element.click();
	}

	protected void sendKeys(By by, String value, WaitStrategy waitStrategy) {
		WebElement element = ExpliclitWaitFactory.performExpliclitWait(waitStrategy, by);
		element.sendKeys(value);
	}

	protected String getPageTitle() {
		return DriverManager.getDriver().getTitle();

	}

}
