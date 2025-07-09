package com.cogmento.ui.iHelper;

public interface IAlert {

	public void accept();
	
	public void dismiss();
	
	public void sendKeys(String value);
	
	public String getText();
}
