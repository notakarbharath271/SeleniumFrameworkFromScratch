package com.qa.driver;

import java.time.Duration;
import java.util.Objects;

import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.constants.FrameworkConstants;
import com.qa.utilities.ReadPropertiesFile;

public class Driver {

	private Driver() {

	}

	public static void initDriver() throws Exception {
		if (Objects.isNull(DriverManager.getDriver())) {
			DriverManager.setDriver(new ChromeDriver());
			DriverManager.getDriver().get(ReadPropertiesFile.getPropertyValueByHashMap("url"));
			DriverManager.getDriver().manage().window().maximize();
			DriverManager.getDriver().manage().timeouts()
					.implicitlyWait(Duration.ofSeconds(FrameworkConstants.getWaitTime()));
		}
	}

	public static void quitDriver() {
		if (Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}

	}

}
