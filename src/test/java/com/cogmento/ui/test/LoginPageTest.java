package com.cogmento.ui.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.cogmento.ui.base.Base;
import com.cogmento.ui.pages.LoginPage;

public class LoginPageTest extends Base {

	private LoginPage login;

	@BeforeTest
	public void setUp() {
		initialization("chrome");
	}

	@Test(priority=0)
	public void loginFunctionality() {
		login = new LoginPage();
		login.LoginFunctionality("ranawaremanasi17@gmail.com", "Admin2025$$");
		login.clickOnLoginBtn();
	}
}
