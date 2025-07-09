package com.cogmento.ui.utility;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.cogmento.ui.base.Base;
import com.cogmento.ui.iHelper.IAction;

public class ActionImpl extends Base implements IAction{

	private WaitImpl wait = new WaitImpl();
	@Override
	public void click(WebElement webElement) {
		
		new Actions(getDriver()).click(wait.elementToBeClickable(webElement)).build().perform();
	}

	@Override
	public void doubleClick(WebElement webElement) {
		
		new Actions(getDriver()).doubleClick(wait.elementToBeClickable(webElement)).build().perform();
	}

	@Override
	public void contextClick(WebElement webElement) {
		
		new Actions(getDriver()).contextClick(wait.elementToBeClickable(webElement)).build().perform();
	}

	@Override
	public void dragAndDrop(WebElement source, WebElement target) {
		
		new Actions(getDriver()).dragAndDrop(wait.visibilityOfElement(source), wait.visibilityOfElement(target)).build().perform();
	}

	@Override
	public void scrollToElement(WebElement webElement) {
		
		new Actions(getDriver()).scrollToElement(wait.visibilityOfElement(webElement)).build().perform();
	}

	@Override
	public void moveToELement(WebElement webElement) {
		
		new Actions(getDriver()).moveToElement(wait.visibilityOfElement(webElement)).build().perform();
	}

	@Override
	public void clickAndHold(WebElement webElement) {
		
		new Actions(getDriver()).clickAndHold(wait.elementToBeClickable(webElement)).build().perform();
	}

	@Override
	public void release(WebElement webElement) {
		
		new Actions(getDriver()).release(wait.visibilityOfElement(webElement)).build().perform();
	}

	@Override
	public void sendKeys(WebElement webElement, String value) {
		
		new Actions(getDriver()).sendKeys(wait.visibilityOfElement(webElement),value).build().perform();
	}

	@Override
	public void keyDown(Keys key) {
		
		new Actions(getDriver()).keyDown(key).build().perform();
	}

	@Override
	public void keyUp(Keys key) {
		
		new Actions(getDriver()).keyUp(key).build().perform();
	}

}
