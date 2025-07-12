package com.cogmento.ui.utility;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.cogmento.ui.base.Base;
import com.cogmento.ui.iHelper.ICalendar;

public class CalendarImpl extends Base implements ICalendar {

	WaitImpl wait = new WaitImpl();
	WebElementImpl webElement = new WebElementImpl();

	@Override
	public void selectMonthAndYear(WebElement webElementMonthAndYear, WebElement nextBtn, String expectedMonthANdYear) {

		while (true) {

			if (webElement.getText(webElementMonthAndYear).contains(expectedMonthANdYear)) {

				break;
			} else {
				webElement.click(nextBtn);
			}
		}
	}

	@Override
	public void selectDate(List<WebElement> list, String expectedDate) {

		for (WebElement selectDate : wait.visiblilityOfAllElements(list)) {

			if (webElement.getText(selectDate).equals(expectedDate)) {

				wait.elementToBeClickable(selectDate).click();
				break;
			}
		}
	}

}
