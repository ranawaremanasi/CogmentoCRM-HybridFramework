package com.cogmento.ui.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ListenerImpl implements ITestListener {

	ExtentReports extentReports;
//	ExtentSparkReporter extentSparkReporter;
	ExtentTest extentTest;

	DateAndTimeImpl dateAndTime;
	SceenshotImpl screenshot = new SceenshotImpl();

	@Override
	public void onStart(ITestContext context) {

		String suiteName = context.getSuite().getName();
		extentReports = new ExtentReports();

		String path = System.getProperty("user.dir") + "//ExtentReports//" + dateAndTime.getDateAndTime("yyyy") + "//"
				+ dateAndTime.getDateAndTime("MMMyyyy") + "//" + dateAndTime.getDateAndTime("ddMMMyyyy") + "//"
				+ suiteName + "//" + dateAndTime.getDateAndTime("ddMMMyyyy_HHmmss") + ".html";
		extentReports.attachReporter(new ExtentSparkReporter(path));
	}

	@Override
	public void onTestStart(ITestResult result) {

		String methodName = result.getMethod().getMethodName();
		extentReports.createTest(methodName);
	}

	@Override
	public void onTestSuccess(ITestResult result) {

		String methodName = result.getMethod().getMethodName();
		extentTest.log(Status.PASS, methodName);
		extentTest.addScreenCaptureFromPath(screenshot.takeScreenShot("PassScreenshot", methodName));
	}

	@Override
	public void onTestFailure(ITestResult result) {

		String methodName = result.getMethod().getMethodName();
		extentTest.log(Status.FAIL, methodName);
		extentTest.addScreenCaptureFromPath(screenshot.takeScreenShot("FailScreenshot", methodName));
	}

	@Override
	public void onTestSkipped(ITestResult result) {

		String methodName = result.getMethod().getMethodName();
		extentTest.log(Status.SKIP, methodName);
		extentTest.addScreenCaptureFromPath(screenshot.takeScreenShot("SkippedScreenshot", methodName));
	}

	@Override
	public void onFinish(ITestContext context) {

		String suiteName = context.getSuite().getName();
		extentReports.flush();
	}

}
