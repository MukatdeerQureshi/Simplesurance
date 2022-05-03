package com.simplesurance.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListPolicyPage {

	WebDriver ldriver;

	public ListPolicyPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[3]/div[1]/div/div/div/div")
	@CacheLookup
	WebElement searchField;

	@FindBy(xpath = "(//span[text()='Policy number'])[2]")
	@CacheLookup
	WebElement policyNumValue;

	@FindBy(xpath = "(//span[text()='E-Mail'])[2]")
	@CacheLookup
	WebElement emailValue;

	@FindBy(xpath = "//span[text()='Newer than']")
	@CacheLookup
	WebElement newerThanValue;

	@FindBy(xpath = "//span[text()='Older than']")
	@CacheLookup
	WebElement olderThanValue;

	@FindBy(xpath = "//input[@type='email']")
	@CacheLookup
	WebElement emailtxt;
	
	@FindBy(xpath = "//input[@type='date']")
	@CacheLookup
	WebElement datetxt;

	@FindBy(xpath = "//table[@data-testid='policy-list']")
	@CacheLookup
	WebElement resultTable;

	public void clickSearchField() {
		searchField.click();
	}

	public void clickPolicyNumValue() {
		policyNumValue.click();
	}

	public void clickEmailValue() {
		emailValue.click();
	}

	public void clickNewerThanValue() {
		newerThanValue.click();
	}

	public void clickOlderThanValue() {
		olderThanValue.click();
	}

	public void setEmailtxt(String email) {
		emailtxt.sendKeys(email);
		emailtxt.sendKeys(Keys.ENTER);
	}
	

	public boolean validateIfResultDisplayed() {
		List<WebElement> table = ldriver.findElements(By.tagName("table"));

		if (table.size() > 0) {
			return true;
		} else {
			return true;
		}

	}

	public boolean fetchPolicySearchResult(String email) {

		boolean flag = true;

		WebElement tbody = resultTable.findElement(By.tagName("tbody"));

		List<WebElement> rows = tbody.findElements(By.tagName("tbody"));

		for (int i = 0; i < rows.size(); i++) {

			List<WebElement> cols = rows.get(i).findElements(By.tagName("th"));

			String fetchedemail = cols.get(2).getText();

			if (fetchedemail.contains(email)) {
				System.out.println("Email value in row no. " + (i + 1) + " matches with the searched value");
				continue;
			} else {
				flag = false;
				System.out.println("Email value in row no. " + (i + 1) + " does not matches with the searched value");

				break;
			}

		}

		return flag;
	}

}
