package com.cogmento.ui.iHelper;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public interface IAction {

	void click(WebElement webElement);
	
	void doubleClick(WebElement webElement);
	
	void contextClick(WebElement webElement);
	
	void dragAndDrop(WebElement source,WebElement target);
	
	void scrollToElement(WebElement webElement);
	
	void moveToELement(WebElement webElement);
	
	void clickAndHold(WebElement webElement);
	
	void release(WebElement webElement);
	
	void sendKeys(WebElement webElement, String value);
	
	void keyDown(Keys key);
	
	void keyUp(Keys key);
}
