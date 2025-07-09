package com.cogmento.ui.utility;

import org.openqa.selenium.Alert;

import com.cogmento.ui.base.Base;

public class AlertImpl extends Base implements Alert{

	Alert alert = getDriver().switchTo().alert();
	@Override
	public void dismiss() {
		
		alert.dismiss();
		
	}

	@Override
	public void accept() {
		
		alert.accept();
	}

	@Override
	public String getText() {
		
		return alert.getText();
	}

	@Override
	public void sendKeys(String keysToSend) {
		
		alert.sendKeys(keysToSend);
	}

}
