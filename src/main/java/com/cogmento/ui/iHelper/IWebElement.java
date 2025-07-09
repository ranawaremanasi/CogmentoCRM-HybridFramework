package com.cogmento.ui.iHelper;

import org.openqa.selenium.WebElement;

public interface IWebElement {

	public void click(WebElement webElement);
	
	public void submit(WebElement webElement);
	
	public void sendKeys(WebElement webElement, String value);
	
	public String getText(WebElement webElement);
	
	public String getAttribute(WebElement webElement, String keyName);
	
	public void clear(WebElement webElement);
	
	public String getCssSelector(WebElement webElement, String keyName);
	
	boolean isDisplayed(WebElement webElement);
	
	boolean isEnabled(WebElement webElement);
	
	boolean isSelected(WebElement webElement);
}
