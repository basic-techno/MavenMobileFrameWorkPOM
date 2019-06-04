package com.datamato.core.pages;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import com.datamato.core.Driver;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage extends Driver{
	private static AndroidDriver<MobileElement> androidDriver;

	/**
	 * Constructor is used to initilize driver, it gets value from Super class
	 * known as BaseSetup
	 */
	public HomePage() throws MalformedURLException {
		androidDriver = super.getDriver();
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
	}

		@CacheLookup
		@AndroidFindBy(xpath = "//android.view.View[@index='2']")
		WebElement newCustomer;

		@CacheLookup
		@AndroidFindBy(xpath = "//android.view.View[@index='4']")
		WebElement existingCustomer;

		@CacheLookup
		@AndroidFindBy(xpath = "//android.view.View[@text='Tell us your customer type.']")
		WebElement welcomePageText;

		@CacheLookup
		@AndroidFindBy(xpath = "//android.view.View[@text='Existing Customer']")
		WebElement existingCustomertxt;


	
	/*public NewCustomer navigateToNewUser() throws Exception {
		AppiumHelper.tap(pageObjects.newCustomer);
		return new NewCustomer(androidDriver);
	}

	public ExistingCustomer navigateToExisting() throws Exception {
		System.out.println("I in Existing customer");
		AppiumHelper.tap(pageObjects.existingCustomer);
		return new ExistingCustomer(androidDriver);
	}*/

	
	
	/**
	 * This method is used to checked Home Page is loaded or not
	 */
	public String welcomePageContent() throws InterruptedException {
		if (newCustomer.isEnabled() && existingCustomer.isEnabled()) {
			System.out.println("Welcome page loaded successfully..!");
			System.out.println("Given String :  "+ welcomePageText.getText());
		}
		return welcomePageText.getText();
	}
	/**
	 * This method is used to select Existing User Tab and checked Login Page is
	 * loaded or not
	 */
	/*public boolean selectExistingCustomer() throws InterruptedException, MalformedURLException {
		pageObjects.existingCustomer.click();
		Thread.sleep(3000);
		if (pageObjects.experiaID.isDisplayed() && pageObjects.password.isDisplayed()) {
			System.out.println("Existing Customer login page opened successfully..!");
			return true;
		} else {
			return false;
		}
	}*/

	
}
