package com.cogmento.ui.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.cogmento.ui.base.Base;

public class Logout extends Base {

	@FindBy(xpath = "//i[@class='settings icon']/parent::div")
	private WebElement settingsMenu;

	@FindBys(@FindBy(xpath = "//div[@class='menu transition visible']/child::a[@class='item']"))
	private List<WebElement> settingOptionsDropDown;
	
	public Logout() {

		PageFactory.initElements(getDriver(), this);
	}
	
	public void LogoutFunctionality() {
		
		settingsMenu.click();
		System.out.println("logout started");
		
		for(WebElement option: settingOptionsDropDown) {
			String actualValue = option.getText();
			if(actualValue.equalsIgnoreCase("Logout")) {
				option.click();
			}
		}
	} 
}
