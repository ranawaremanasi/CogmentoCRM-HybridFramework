package com.cogmento.ui.iHelper;

public interface IDropDown {

	public void selectByVisibleText(String VisibleText);
	
	public void selectByValue(String value);
	
	public void selectByIndexPosition(int index);
	
	public void getOptions();
}
