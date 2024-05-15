package com.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.driver.Driver;

public class BaseTest {
	
	protected BaseTest() {
		
	}


	@BeforeMethod
	public void setup() throws Exception {
		Driver.initDriver();
	}

	@AfterMethod
	public void teardown() {
		Driver.quitDriver();
	}

}
