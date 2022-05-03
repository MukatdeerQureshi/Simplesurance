package com.simplesurance.pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImportPolicyPage {

	WebDriver ldriver;

	public ImportPolicyPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "// span[text()='Import']")
	@CacheLookup
	WebElement importLink;

	@FindBy(xpath = "(// span[text()='Import'])[2]")
	@CacheLookup
	WebElement importBtn;

	@FindBy(xpath = "// span[text()='Create insurance']")
	@CacheLookup
	WebElement createInsurancebtn;

	@FindBy(xpath = "//div[contains(@data-testid,'snackbar-createAgent')]")
	@CacheLookup
	WebElement resultPopUp;

	@FindBy(xpath = "//span[contains(text(),'Success')]")
	@CacheLookup
	WebElement successMsg;

	@FindBy(xpath = "//li[contains(text(),'Error')]")
	@CacheLookup
	WebElement errorMsg;

	public void clickImportBtn() {
		importBtn.click();
	}

	public void clickImportLink() {
		importLink.click();
	}

	public void clickCreateInsurancebtn() {
		createInsurancebtn.click();
	}

	public void selectFileToUpload(String keys) throws AWTException {

		StringSelection ss = new StringSelection(keys);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		// native key strokes for CTRL, V and ENTER keys
		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	public String getResult() {
		String msg="";
		String value = resultPopUp.getAttribute("data-testid").toString();
		//System.out.println(value);

		if (value.contains("success")) {
			msg = successMsg.getText();
		} else if (value.contains("error")) {
			msg = errorMsg.getText();
		}

		return msg;
	}

}
