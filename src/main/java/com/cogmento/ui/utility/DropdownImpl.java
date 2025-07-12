package com.cogmento.ui.utility;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.cogmento.ui.base.Base;
import com.cogmento.ui.iHelper.IDropDown;

public class DropdownImpl extends Base implements IDropDown {

	WaitImpl wait = new WaitImpl();
	WebElementImpl webElementImpl = new WebElementImpl();

	@Override
	public void selectByVisibleText(WebElement webElement, String VisibleText) {

		new Select(wait.visibilityOfElement(webElement)).selectByVisibleText(VisibleText);
	}

	@Override
	public void selectByValue(WebElement webElement, String value) {

		new Select(wait.visibilityOfElement(webElement)).selectByValue(value);
	}

	@Override
	public void selectByIndexPosition(WebElement webElement, int index) {

		new Select(wait.visibilityOfElement(webElement)).selectByIndex(index);
	}

	@Override
	public void getOptions(WebElement webElement) {

		List<WebElement> lists = new Select(wait.visibilityOfElement(webElement)).getOptions();

		WebElementImpl webElementImpl = new WebElementImpl();
		for (WebElement value : lists) {
			System.out.println(webElementImpl.getText(value));
		}
	}

	@Override
	public void selectValueUsingContains(List<WebElement> webElementList, String expectedValue) {

		for (WebElement value : webElementList) {
			String actualValue = value.getText();
			if(actualValue.contains(expectedValue) || actualValue.equals(expectedValue) || actualValue.equalsIgnoreCase(expectedValue)) {
				webElementImpl.click(wait.elementToBeClickable(value));
				break;
			}
		}
	}

}
