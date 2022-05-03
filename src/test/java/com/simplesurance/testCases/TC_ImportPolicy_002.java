package com.simplesurance.testCases;

import java.awt.Robot;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.simplesurance.pageObjects.CreatePolicyPage;
import com.simplesurance.pageObjects.ImportPolicyPage;
import com.simplesurance.pageObjects.LoginPage;

public class TC_ImportPolicy_002 extends BaseClass {

	LoginPage lp;

	@Test(priority = 0)
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

	@Test(priority = 1)
	public void importPolicy() throws IOException, Exception {

		logger.info("Importing new policy from csv file");

		ImportPolicyPage ip = new ImportPolicyPage(driver);

		lp = new LoginPage(driver);

		ip.clickImportLink();

		ip.clickImportBtn();

		String projectPath = System.getProperty("user.dir");
		String csvFilePath = projectPath + fileToUpload;

		Thread.sleep(5000);

		ip.selectFileToUpload(csvFilePath);

		logger.info("CSV file selected successfully");

		Thread.sleep(5000);

		ip.clickCreateInsurancebtn();

		logger.info("Clicked on create insurance button");

		String resultMsg = ip.getResult();

		if (resultMsg.contains("Success")) {
			Assert.assertTrue(true);

			logger.info(resultMsg);
			logger.info("All Records Uploaded successfully");

		} else if (resultMsg.contains("Error")) {

			logger.info(resultMsg);
			logger.info("Records Uploading failed");
			captureScreen(driver, "policyUploadfailed");
			Assert.assertTrue(false);
		}

		Thread.sleep(5000);

	}

}
