package com.simplesurance.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.simplesurance.pageObjects.CreatePolicyPage;
import com.simplesurance.pageObjects.LoginPage;
import com.simplesurance.testCases.BaseClass;

public class TC_CreatePolicy_001 extends BaseClass {
	
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
	public void createPolicy() throws IOException, Exception {

		logger.info("Creating new policy");
		
		
		CreatePolicyPage cp = new CreatePolicyPage(driver);
		
		lp = new LoginPage(driver);
		
		
		cp.clickNewTab();
		
		cp.clickCountryField();
		cp.clickItalyOption();
		
		cp.clickProductNameField();
		cp.clickProductNameOption();
		
		cp.clickTariffField();
		cp.clickTariffOption();
		
		cp.clickInsuranceCategoryField();
		cp.clickInsuranceCategoryOption();
		
		cp.clickPeriodField();
		cp.clickPeriod24MonthOption();
		
		cp.clickPaymentTypeField();
		cp.clickPaymentTypeOption();
		
		cp.clickClassField();
		cp.clickClassOption();
		
		cp.setSerialNumber("SER-111188");

		cp.setDeviceName("Name-111888");
		
		cp.setInvoiceNumber("Inv-11879");
		
		cp.setOrderNumber("Order-11963");
		
		logger.info("Product details entered successfully");
		
		cp.clickNextBtn();
		
		cp.setFirstNametxt("Mary");
		
		cp.setLastNametxt("Jane");
		
		cp.setEmailtxt("mary123@simplesurance.de");
		
		cp.setStreetNametxt("STRASSE");
		
		cp.setHouseNumbertxt("12");
		
		cp.setPostalCodetxt("454545");
		
		cp.setCitytxt("Berlin");
		
		cp.setCountrytxt("FR");
		
		cp.setTaxCodetxt("TAX-111144");
		
		logger.info("Customer details entered successfully");
		
		cp.clickNextBtn();
		
		cp.clickConfirmationFirstCheckBox();
		
		cp.clickConfirmationSecondCheckBox();
		
		cp.clickConfirmationThirdCheckBox();
		
		cp.clickConfirmationFourthCheckBox();
		
		logger.info("All confirmation checkbox selected");
		
		cp.clickCreateInsurancebtn();
		
		cp.clickCreditCardRadiobtn();
		
		cp.clickContinuePaymentbtn();
		
		logger.info("Clicked on Continue payment");
		
		Thread.sleep(2000);
		cp.switchFrame();
		
		cp.setCardNumbertxt("4242424242424242");
		
		cp.setExpiryDatetxt("2230");
		
		cp.setcvctxt("123");
		
		logger.info("Value Entered in Credit fields");
		
		cp.switchToParent();
		logger.info("Switch to parent frame");
		
		Thread.sleep(5000);
		
		cp.clickOrderbtn();
		
		logger.info("Clicked on Order btn");
		
		Thread.sleep(10000);
		
		logger.info("Navigated to result screen");
		
		lp.clickMultiLanguageIcon();
		lp.clickEnglishLabel();
		
		logger.info("Language canged to English");
		
		Thread.sleep(5000);
		
		String createPolicyStatus=cp.getCreatePolicyStatus();
		
		if(createPolicyStatus.trim().equals("Created"))
		{
			Assert.assertTrue(true);
			logger.info("New Insurance Policy Created Successfully!!");
			String certNum=cp.getCertificateNum();
			logger.info("Certificate number of newly created policy is "+certNum);
			
		}
		else
		{
			logger.info("test case failed....");
			captureScreen(driver,"addNewCustomer");
			Assert.assertTrue(false);
		}
		
		Thread.sleep(5000);
		
		
	
		
		
		
		
		
	}

}
