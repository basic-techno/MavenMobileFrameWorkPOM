package com.datamato.tests;

import org.testng.annotations.Test;

import com.datamato.core.Driver;
import com.datamato.core.pages.HomePage;

public class BaseTest extends Driver{
	@Test
	public void displayWelcomeText() throws Exception{
		HomePage homePage= new HomePage();
		homePage.welcomePageContent();
	}
}
