package com.jbk;


import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersEx implements ITestListener {
	WebDriver driver;
	
	public void onFinish(ITestContext result) {
		System.out.println("test suite is finished");
		
	}

	
	public void onStart(ITestContext result) {
		System.out.println("test suite is started");
		
	}

	// 10----100%// 8 passed----80%
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName()+" is  failed");
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		ts.getScreenshotAs(OutputType.FILE);
	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName()+" is  skipped");
		
	}

	
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName()+" is  started");
		
	}

	
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+" is  passed");
		
	}

}
