package com.cogmento.ui.utility;

import java.time.Duration;

import com.cogmento.ui.base.Base;
import com.cogmento.ui.iHelper.IWebDriver;

public class WebDriverImpl extends Base implements IWebDriver{

	@Override
	public void get(String openUrl) {
		getDriver().get(openUrl);
	}
	
	public String getCurrentUrl() {
		return getDriver().getCurrentUrl();
	}

	public String getTitle() {
		return getDriver().getTitle();
	}

	@Override
	public void implicitlyWait(Duration d) {
		
		getDriver().manage().timeouts().implicitlyWait(d);
	}

	@Override
	public void pageLoadTimeout(Duration d) {
		
		getDriver().manage().timeouts().pageLoadTimeout(d);
	}

	@Override
	public void deleteAllCookies() {
		
		getDriver().manage().deleteAllCookies();
	}

	@Override
	public void minimize() {
		
		getDriver().manage().window().minimize();
	}

	@Override
	public void maximize() {
		
		getDriver().manage().window().maximize();
	}

	@Override
	public void fullScreen() {
		
		getDriver().manage().window().fullscreen();
	}

	//Navigate To
	
	@Override
	public void forward() {
		
		getDriver().navigate().forward();
	}

	@Override
	public void back() {
		
		getDriver().navigate().back();
	}

	@Override
	public void refresh() {
		
		getDriver().navigate().refresh();
	}
}
