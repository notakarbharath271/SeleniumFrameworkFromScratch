package com.qa.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

import com.qa.constants.FrameworkConstants;
import com.qa.enums.ConfigProperties;

public final class PropertiesUtils {

	private static Properties prop = new Properties();
	private final static Map<String, String> CONFIGMAP = new HashMap<>();

	private PropertiesUtils() {
	}

	static {

		try {
			FileInputStream fis = new FileInputStream(FrameworkConstants.getConfigFilePath());
			prop.load(fis);
			/* using the  key set
			for (Object key : prop.keySet()) {
				CONFIGMAP.put(String.valueOf(key), String.valueOf(prop.get(key)));
			}
			//    				or
			 * using entry set
			for(Map.Entry<Object, Object> entry : prop.entrySet()) {
				CONFIGMAP.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()))	;			
			}
			*/
			// or using lambda expression
			prop.entrySet().forEach(entry -> CONFIGMAP.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()).trim()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	//HashMap method
	public static String getPropertyValueByHashMap(ConfigProperties key) throws Exception {
		if(Objects.isNull(key)||Objects.isNull(CONFIGMAP.get(key.name().toLowerCase()))) {
			throw new Exception("Property name " + key + " is not found. Please check config.properties file");
		}
		return CONFIGMAP.get(key.name().toLowerCase());
	}
//normal method
	public static String getPropertyValue(ConfigProperties key) throws Exception {

		if (Objects.isNull(prop.getProperty(key.name().toLowerCase())) || Objects.isNull(key)) {
			throw new Exception("Property name " + key + " is not found. Please check config.properties file");
		}

		return prop.getProperty(key.name().toLowerCase());
	}

}
