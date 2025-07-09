package com.cogmento.ui.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	public static String getProprty(String keyName) {
		String path = System.getProperty("user.dir") + "/src/main/java/com/cogmento/ui/configuration/config.properties";
		FileInputStream file;
		Properties prop = new Properties();
		try {
			file = new FileInputStream(path);
			prop.load(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop.getProperty(keyName);
	}
}
