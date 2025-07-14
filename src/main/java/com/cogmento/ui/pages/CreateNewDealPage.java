package com.cogmento.ui.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.cogmento.ui.base.Base;
import com.cogmento.ui.utility.CalendarImpl;
import com.cogmento.ui.utility.WebElementImpl;

public class CreateNewDealPage extends Base {

	WebElementImpl webElementImpl;
	CalendarImpl HandleCalendar;

	@FindBy(xpath = "//input[@name='title']")
	WebElement Title;

	@FindBy(xpath = "//button[text()='Save']")
	WebElement saveBtn;

	@FindBy(name = "description")
	WebElement Description;

	@FindBy(xpath = "//input[@class='calendarField']")
	WebElement closeDate;

	@FindBy(xpath = "//div[@class='react-datepicker__current-month']")
	WebElement monthYear;

	@FindBy(xpath = "//button[@class='react-datepicker__navigation react-datepicker__navigation--next react-datepicker__navigation--next--with-time']")
	WebElement nextBtn;

	@FindBy(xpath = "//div[contains(@class,'react-datepicker__day react-datepicker__day')and not (contains(@class,'outside-month'))]")
	List<WebElement> datevalues;

	@FindBys(@FindBy(xpath = "//ul[@class='react-datepicker__time-list']/child::li"))
	List<WebElement> Time;

	public CreateNewDealPage() {

		PageFactory.initElements(getDriver(), this);
	}

	public void createNewDealFunctionality(String title) {
		webElementImpl = new WebElementImpl();
		webElementImpl.sendKeys(Title, title);

		webElementImpl.click(saveBtn);
	}

	public void createNewDealFunctionality(String title, String Desc) {

		webElementImpl.sendKeys(Title, title);

		webElementImpl.sendKeys(Description, Desc);

		webElementImpl.click(saveBtn);
	}

	public void createNewDealFunctionality(String title, String Desc, String expectedMonthYear, String expectedDate,
			String expectedTime) {

		HandleCalendar = new CalendarImpl();
		webElementImpl.sendKeys(Title, title);

		webElementImpl.sendKeys(Description, Desc);

		webElementImpl.click(closeDate);

		HandleCalendar.selectMonthAndYear(monthYear, nextBtn, expectedMonthYear);

		HandleCalendar.selectDate(datevalues, expectedDate);

		HandleCalendar.selectDate(Time, expectedTime);

		webElementImpl.click(saveBtn);
	}

}
