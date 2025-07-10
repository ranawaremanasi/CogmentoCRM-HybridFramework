package com.cogmento.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cogmento.ui.base.Base;
import com.cogmento.ui.utility.WebElementImpl;

public class LoginPage extends Base {

	WebElementImpl webElement = new WebElementImpl();
	
	// Object Repository
	@FindBy(xpath = "//input[@name='email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath = "//div[text()='Login']")
	private WebElement loginBtn;

	// POM using PageFactory.initElements() method to initialize OR
	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}

	// Associated methods without Test Data
	public void LoginFunctionality(String email, String password){
		
		webElement.sendKeys(this.email, email);
		webElement.sendKeys(this.password, password);
	}
	
	public void clickOnLoginBtn() {
		webElement.click(this.loginBtn);
	}
}
