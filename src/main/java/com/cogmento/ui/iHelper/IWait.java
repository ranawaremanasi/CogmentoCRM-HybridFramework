package com.cogmento.ui.iHelper;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;

public interface IWait {

	public WebElement visibilityOfElement();
	
	public WebElement elementToBeClickable();
	
	public List<WebElement> visiblilityOfAllElements();
	
	public Alert alertIsPresent();
}
