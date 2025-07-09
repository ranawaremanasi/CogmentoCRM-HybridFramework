package com.cogmento.ui.base;

import java.time.Duration;

import com.cogmento.ui.utility.DriverFactory;
import com.cogmento.ui.utility.PropertyReader;
import com.cogmento.ui.utility.WebDriverImpl;

public class Base extends DriverFactory {

	public void initialization(String browserName) {
		setDriver(browserName);

		WebDriverImpl webDriver = new WebDriverImpl();

		webDriver.maximize();

		webDriver.implicitlyWait(Duration.ofSeconds(30));

		webDriver.pageLoadTimeout(Duration.ofSeconds(30));

		webDriver.deleteAllCookies();

		webDriver.get(PropertyReader.getProprty("BASE_URI"));
	}
}
