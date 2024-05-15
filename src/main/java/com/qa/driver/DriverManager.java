package com.qa.driver;

import org.openqa.selenium.WebDriver;

public final class DriverManager {

	private DriverManager() {
	}

	public static ThreadLocal<WebDriver> dr = new ThreadLocal<>();

	public static WebDriver getDriver() {
		return dr.get();
	}

	public static void setDriver(WebDriver drRef) {
		dr.set(drRef);
	}

	public static void unload() {

		dr.remove();
	}
}
