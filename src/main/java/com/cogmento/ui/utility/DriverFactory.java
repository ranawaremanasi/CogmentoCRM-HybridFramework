package com.cogmento.ui.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {

	private static ThreadLocal<WebDriver> td = new ThreadLocal<WebDriver>();

	public WebDriver getDriver() {
		return td.get();
	}

	public void setDriver(String driverName) {

		if(driverName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "F://Softtech March 2025//chromedriver-win64//chromedriver-win64//chromedriver.exe");
			td.set(new ChromeDriver());
		}
		else if(driverName.equalsIgnoreCase("edge")) {
			td.set(new EdgeDriver());
		}
		else if(driverName.equalsIgnoreCase("incognito")) {
			td.set(new ChromeDriver(new ChromeOptions().addArguments("--incognito")));
		}
		else if(driverName.equalsIgnoreCase("headless")) {
			td.set(new ChromeDriver(new ChromeOptions().addArguments("--headless")));
		}
		else if(driverName.equalsIgnoreCase("private")) {
			td.set(new EdgeDriver(new EdgeOptions().addArguments("--private")));
		}
		else if(driverName.equalsIgnoreCase("firefox")) {
			td.set(new FirefoxDriver());
		}
		else if(driverName.equalsIgnoreCase("Safari")) {
			td.set(new SafariDriver());
		}
		else {
			System.out.println("Invalid Driver: Please enter valid Driver name");
		}
	}
}
