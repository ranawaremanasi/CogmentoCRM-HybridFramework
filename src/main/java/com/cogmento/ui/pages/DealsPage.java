package com.cogmento.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cogmento.ui.base.Base;

public class DealsPage extends Base {

	@FindBy(xpath = "//i[@class='money icon']/ancestor::div[@class='menu-item-wrapper']")
	WebElement dealsButton;

	@FindBy(xpath = "//a[@href='/deals/new']")
	WebElement createDeal;

	public DealsPage() {

		PageFactory.initElements(getDriver(), this);
	}

	public void navigateToDeal() {

		dealsButton.click();

		createDeal.click();

	}

}