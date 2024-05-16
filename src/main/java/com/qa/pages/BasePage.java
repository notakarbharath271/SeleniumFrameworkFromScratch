package com.qa.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.constants.FrameworkConstants;
import com.qa.driver.DriverManager;

public class BasePage {

	protected void click(By by, String waitStrategy) {
		if (waitStrategy.equalsIgnoreCase("clickable")) {
			explicitlyWaitElementToBeClickable(by);

		} else if (waitStrategy.equalsIgnoreCase("present")) {
			explicitlyWaitElementToBePresent(by);
		}
		DriverManager.getDriver().findElement(by).click();
	}

	protected void sendKeys(By by, String value, String waitStrategy) {
		if (waitStrategy.equalsIgnoreCase("clickable")) {
			explicitlyWaitElementToBeClickable(by);

		} else if (waitStrategy.equalsIgnoreCase("present")) {
			explicitlyWaitElementToBePresent(by);
		}
		DriverManager.getDriver().findElement(by).sendKeys(value);
	}

	protected String getPageTitle() {
		return DriverManager.getDriver().getTitle();

	}

	private void explicitlyWaitElementToBeClickable(By by) {

		new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(FrameworkConstants.getWaitTime()))
				.until(ExpectedConditions.elementToBeClickable(by));
//				.until(driver -> driver.findElement(by).isEnabled());// java 8 lambda expiration

	}

	private void explicitlyWaitElementToBePresent(By by) {
		new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(FrameworkConstants.getWaitTime()))
				.until(ExpectedConditions.presenceOfElementLocated(by));
	}

}
