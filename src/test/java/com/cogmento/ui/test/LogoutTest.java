package com.cogmento.ui.test;

import org.testng.annotations.Test;

import com.cogmento.ui.base.Base;
import com.cogmento.ui.pages.Logout;

public class LogoutTest extends Base{

	private Logout logout;
	
	@Test
	public void logoutFunctionality() {
		logout = new Logout();
		
		logout.LogoutFunctionality();
		getDriver().quit();
	}
}
