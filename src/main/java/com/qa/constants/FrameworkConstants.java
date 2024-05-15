package com.qa.constants;

public final class FrameworkConstants {

	private FrameworkConstants() {

	}

	private static final String PROJECTPATH = System.getProperty("user.dir");
	private static final long waitTime = 3000;
	private static final String CONFIGFILEPATH = PROJECTPATH + "/src/test/resources/Config/config.properties";

	public static String getConfigFilePath() {
		return CONFIGFILEPATH;
	}

	public static long getWaitTime() {
		return waitTime;
	}

}
