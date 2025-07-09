package com.cogmento.ui.utility;

import org.openqa.selenium.WebElement;

import com.cogmento.ui.base.Base;
import com.cogmento.ui.iHelper.IWebElement;

public class WebElementImpl extends Base implements IWebElement{

	WaitImpl wait = new WaitImpl();
	
	@Override
	public void click(WebElement webElement) {
		
		wait.elementToBeClickable(webElement).click();
	}

	@Override
	public void submit(WebElement webElement) {
		
		wait.elementToBeClickable(webElement).submit();
	}

	@Override
	public void sendKeys(WebElement webElement, String value) {
		
		wait.visibilityOfElement(webElement).sendKeys(value);
	}

	@Override
	public String getText(WebElement webElement) {
		
		return wait.visibilityOfElement(webElement).getText();
	}

	@Override
	public String getAttribute(WebElement webElement, String keyName) {
		
		return wait.visibilityOfElement(webElement).getAttribute(keyName);
	}

	@Override
	public void clear(WebElement webElement) {
		
		wait.visibilityOfElement(webElement).clear();
	}

	@Override
	public String getCssSelector(WebElement webElement, String keyName) {
		
		return wait.visibilityOfElement(webElement).getCssValue(keyName);
	}

	@Override
	public boolean isDisplayed(WebElement webElement) {
		
		return wait.visibilityOfElement(webElement).isDisplayed();
	}

	@Override
	public boolean isEnabled(WebElement webElement) {
		
		return wait.visibilityOfElement(webElement).isEnabled();
	}

	@Override
	public boolean isSelected(WebElement webElement) {
		
		return wait.visibilityOfElement(webElement).isSelected();
	}

}
