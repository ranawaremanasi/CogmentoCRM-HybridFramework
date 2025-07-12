package com.cogmento.ui.iHelper;

import java.util.List;

import org.openqa.selenium.WebElement;

public interface ICalendar {

	void selectMonthAndYear(WebElement webElementMonthAndYear, WebElement nextBtn, String expectedMonthANdYear);

	void selectDate(List<WebElement> list, String expectedDate);
}
