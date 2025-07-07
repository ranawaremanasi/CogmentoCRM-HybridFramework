package com.cogmento.ui.iHelper;

import org.openqa.selenium.WebElement;

public interface IWebElement {

	public void click(WebElement wwebElement);
	
	public void submit(WebElement wwebElement);
	
	public void sendKeys(WebElement wwebElement);
	
	public String getText(WebElement wwebElement);
}
