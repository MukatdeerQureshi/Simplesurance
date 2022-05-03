package com.simplesurance.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		
	@FindBy(name="_username")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(name="_password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="//span[text()='Next']")
	@CacheLookup
	WebElement nextbtn;
	
	@FindBy(xpath="//span[text()='Deutsch']")
	@CacheLookup
	WebElement multiIconBtn;
	
	@FindBy(xpath="//span[text()='Englisch']")
	@CacheLookup
	WebElement englishListValue;
	
	
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	
	public void clickNext()
	{
		nextbtn.click();
	}	
	
	public void clickMultiLanguageIcon()
	{
		multiIconBtn.click();
	}
	
	public void clickEnglishLabel()
	{
		englishListValue.click();
	}
	

}
