package com.datamato.core.pages;

import org.openqa.selenium.support.PageFactory;

import com.datamato.core.Driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class NewCustomer extends Driver {

	//private static AndroidDriver<MobileElement> androidDriver;
	public NewCustomer(AppiumDriver<MobileElement> androidDriver) throws Exception {
		androidDriver = super.getDriver();
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
	}
}
