package com.datamato.common;

import java.net.MalformedURLException;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.datamato.core.BaseSetup;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

public class AppiumHelper {

	public static AppiumDriver<MobileElement> androidDriver;
	public static TouchAction touch = new TouchAction(androidDriver);
	public static int waitUntilXseconds = 20;
	public static Point point = null;
	BaseSetup baseSetup = new BaseSetup();
	
	AppiumHelper() throws MalformedURLException{
		androidDriver=baseSetup.getDriver();
	}
	/**
	 * Tap an element
	 * 
	 * @param defaultValues
	 */
	public static void tap(WebElement defaultValues) {
		waitUntilClickable(defaultValues);
		touch.tap(defaultValues).perform();
	}
	
	/**
	 * Tap on point
	 * 
	 * @param pointA
	 * @param pointB
	 */
	public static void tap(int pointA, int pointB) {
		touch.tap(pointA, pointB).perform();
	}
	
	/**
	 * Wait until an element is visible and enabled such that it can be clicked.
	 * 
	 * @param defaultValues
	 * @param waitTime
	 */
	public static void waitUntilClickable(WebElement defaultValues) {
		WebDriverWait wait = new WebDriverWait(androidDriver, waitUntilXseconds);
		wait.until(ExpectedConditions.elementToBeClickable((WebElement)defaultValues));
	}
}
