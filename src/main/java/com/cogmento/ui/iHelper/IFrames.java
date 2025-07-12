package com.cogmento.ui.iHelper;

import org.openqa.selenium.WebElement;

public interface IFrames {

	void frame(String idOrname);

	void frame(WebElement webElement);

	void frame(int index);

	void parentFrame();

	void defaultContent();
}
