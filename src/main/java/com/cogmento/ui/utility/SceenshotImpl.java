package com.cogmento.ui.utility;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cogmento.ui.base.Base;
import com.cogmento.ui.iHelper.IScreenshot;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class SceenshotImpl extends Base implements IScreenshot {

	DateAndTimeImpl dateAndTime = new DateAndTimeImpl();

	@Override
	public String takeScreenShot(String folderName, String testCaseName) {

		String path = System.getProperty("user.dir") + "//Screenshot//" + dateAndTime.getDateAndTime("yyyy") + "//"
				+ dateAndTime.getDateAndTime("MMMyyyy") + "//" + dateAndTime.getDateAndTime("ddMMMyyyy") + "//"
				+ folderName + "//" + testCaseName + dateAndTime.getDateAndTime("ddMMMyyyy_HHmmss") + ".png";

		TakesScreenshot takesScreenshot = (TakesScreenshot) getDriver();
		File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		File destination = new File(path);

		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return path;
	}

	@Override
	public String fullPageScreenshot(String folderName, String testCaseName) {

		String path = System.getProperty("user.dir") + "//Screenshot//" + dateAndTime.getDateAndTime("yyyy") + "//"
				+ dateAndTime.getDateAndTime("MMMyyyy") + "//" + dateAndTime.getDateAndTime("ddMMMyyyy") + "//"
				+ folderName + "//" + testCaseName + dateAndTime.getDateAndTime("ddMMMyyy_HHmmss") + ".png";

		AShot ashot = new AShot();
		BufferedImage source = ashot.shootingStrategy(ShootingStrategies.viewportPasting(1000))
				.takeScreenshot(getDriver()).getImage();

		try {
			ImageIO.write(source, "PNG", new File(path));
		} catch (IOException e) {

			e.printStackTrace();
		}
		return path;
	}

}
