package com.datamato.core.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import com.datamato.core.Driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ExistingCustomer extends Driver {
	public ExistingCustomer(AppiumDriver<MobileElement> androidDriver) throws Exception {
		androidDriver = super.getDriver();
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
	}
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.view.View[@text='LOG IN TO ACCESS CUSTOMER SERVICE']")
	WebElement loginExistingCutomerText;

	@CacheLookup
	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@class='android.view.View']]]")
	WebElement experiaID;

	@CacheLookup
	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText' and ./parent::*[./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@class='android.view.View']]]]")
	WebElement password;

	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.Button[@text='LOGIN']")
	WebElement loginButton;

	@CacheLookup
	@AndroidFindBy(xpath = "//*[@text='Active Relations' and @class='android.view.View']")
	WebElement activeRelation;
	
	public String loginToExistingCutomer() {
		experiaID.sendKeys("163961");
		password.sendKeys("Bajaj@123");
		loginButton.click();
		return activeRelation.getText();
	}

}
