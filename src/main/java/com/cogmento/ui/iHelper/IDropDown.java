package com.cogmento.ui.iHelper;

import java.util.List;

import org.openqa.selenium.WebElement;

public interface IDropDown {

	public void selectByVisibleText(WebElement webElement, String VisibleText);

	public void selectByValue(WebElement webElement, String value);

	public void selectByIndexPosition(WebElement webElement, int index);

	public void getOptions(WebElement webElement);

	public void selectValueUsingContains(List<WebElement> webElementList, String expectedValue);
}
