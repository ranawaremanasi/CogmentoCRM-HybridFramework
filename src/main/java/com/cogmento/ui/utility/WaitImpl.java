package com.cogmento.ui.utility;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cogmento.ui.base.Base;
import com.cogmento.ui.iHelper.IWait;

public class WaitImpl extends Base implements IWait {

	@Override
	public WebElement visibilityOfElement(WebElement webElement) {
		
		return new WebDriverWait(getDriver(),Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(webElement));
	}

	@Override
	public WebElement elementToBeClickable(WebElement webElement) {
		
		return new WebDriverWait(getDriver(),Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(webElement));
	}

	@Override
	public List<WebElement> visiblilityOfAllElements(List<WebElement> webElementList) {
		
		return new WebDriverWait(getDriver(),Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfAllElements(webElementList));
	}

	@Override
	public Alert alertIsPresent() {
		
		return new WebDriverWait(getDriver(),Duration.ofSeconds(30)).until(ExpectedConditions.alertIsPresent());
	}

}
