package com.cogmento.ui.iHelper;

import java.time.Duration;

import org.openqa.selenium.WindowType;

public interface IWebDriver {

	public void get(String openUrl);
	
	public String getCurrentUrl();
	
	public String getTitle();
	
	public void implicitlyWait(Duration d);
	
	public void pageLoadTimeout(Duration d);
	
	public void deleteAllCookies();
	
	public void minimize();
	
	public void maximize();
	
	public void fullScreen();
	
	public void forward();
	
	public void back();
	
	public void refresh();
	
	public void close();
	
	public void quit();
	
	public void newWindow(WindowType windowType); 
}
