package com.simplesurance.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.simplesurance.pageObjects.CreatePolicyPage;
import com.simplesurance.pageObjects.ListPolicyPage;
import com.simplesurance.pageObjects.LoginPage;

public class TC_ListPolicy_003 extends BaseClass {
	
	LoginPage lp;

	@Test(priority=0)
	public void loginTest() throws IOException {

		logger.info("URL is opened");

		lp = new LoginPage(driver);

		lp.clickMultiLanguageIcon();
		lp.clickEnglishLabel();

		logger.info("Display language changed to English");

		lp.setUserName(username);
		logger.info("Entered username");

		lp.setPassword(password);
		logger.info("Entered password");

		lp.clickNext();

		if (driver.getTitle().equals("Insurance Manager")) {
			Assert.assertTrue(true);
			logger.info("Login test passed");
		} else {
			captureScreen(driver, "loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}

	}
	
	@Test(priority=1)
	public void searchByEmail() throws IOException, Exception {

		logger.info("Starting to perform search operation using email address...");
		
		
		ListPolicyPage lpp = new ListPolicyPage(driver);
		
		lp = new LoginPage(driver);
		
		lpp.clickSearchField();
		
		lpp.clickEmailValue();
		lpp.setEmailtxt("mail2@simplesurance.de");
		
		logger.info("Email value entered to perform search operation");
		
		Thread.sleep(2000);
		
		logger.info("Validating if results are displayed");
		
		boolean displayResultTable=lpp.validateIfResultDisplayed();
		
		if (displayResultTable==true) {
			Assert.assertTrue(true);
			logger.info("Results are displayed");

		} else {

			logger.info("Results are not displayed");
			captureScreen(driver, "searchByEmailFailed");
			Assert.assertTrue(false);
		}
		
		boolean result=lpp.fetchPolicySearchResult("mail2@simplesurance.de");
		
		logger.info("Compared the searched email value with displayed email value of all rows");
				
		if (result==true) {
			Assert.assertTrue(true);
			logger.info("All the displayed values satisfies the search criteria");

		} else {

			logger.info("All the displayed values does not satisfies the search criteria");
			captureScreen(driver, "searchByEmail");
			Assert.assertTrue(false);
		}
		
		
		
	}

}
