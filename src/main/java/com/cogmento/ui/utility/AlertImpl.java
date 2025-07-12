package com.cogmento.ui.utility;

import org.openqa.selenium.Alert;

import com.cogmento.ui.base.Base;

public class AlertImpl extends Base implements Alert {

	WaitImpl wait = new WaitImpl();
//	Alert alert = getDriver().switchTo().alert();

	@Override
	public void dismiss() {

		wait.alertIsPresent().dismiss();
//		alert.dismiss();

	}

	@Override
	public void accept() {

		wait.alertIsPresent().accept();
//		alert.accept();
	}

	@Override
	public String getText() {

		return wait.alertIsPresent().getText();
	}

	@Override
	public void sendKeys(String keysToSend) {

		wait.alertIsPresent().sendKeys(keysToSend);
	}

}
