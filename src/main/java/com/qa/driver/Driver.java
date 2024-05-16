package com.qa.driver;

import java.util.Objects;

import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.enums.ConfigProperties;
import com.qa.utilities.PropertiesUtils;

public class Driver {

	private Driver() {

	}

	public static void initDriver() throws Exception {
		if (Objects.isNull(DriverManager.getDriver())) {
			DriverManager.setDriver(new ChromeDriver());
			DriverManager.getDriver().get(PropertiesUtils.getPropertyValueByHashMap(ConfigProperties.URL));
			DriverManager.getDriver().manage().window().maximize();
		}
	}

	public static void quitDriver() {
		if (Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}

	}

}
