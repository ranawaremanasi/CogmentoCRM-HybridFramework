package com.cogmento.ui.utility;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cogmento.ui.base.Base;
import com.cogmento.ui.iHelper.IFrames;

public class FramesImpl extends Base implements IFrames{

	@Override
	public void frame(String idOrname) {
		
		new WebDriverWait(getDriver(),Duration.ofSeconds(3000)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(idOrname));
//		getDriver().switchTo().frame(idOrname);
	}

	@Override
	public void frame(WebElement webElement) {
		
		new WebDriverWait(getDriver(),Duration.ofSeconds(3000)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(webElement));
//		getDriver().switchTo().frame(webElement);
	}

	@Override
	public void frame(int index) {
		
		new WebDriverWait(getDriver(),Duration.ofSeconds(3000)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(index));
//		getDriver().switchTo().frame(index);
	}

	@Override
	public void parentFrame() {
		
		getDriver().switchTo().parentFrame();
	}

	@Override
	public void defaultContent() {
		
		getDriver().switchTo().defaultContent();
	}

}
