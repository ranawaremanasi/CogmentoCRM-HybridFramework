package com.cogmento.ui.iHelper;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;

public interface IWait {

	public WebElement visibilityOfElement(WebElement webElement);
	
	public WebElement elementToBeClickable(WebElement webElement);
	
	public List<WebElement> visiblilityOfAllElements(List<WebElement> webElementList);
	
	public Alert alertIsPresent();
}
