package com.simplesurance.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatePolicyPage {

	WebDriver ldriver;

	public CreatePolicyPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//span[text()='New']")
	@CacheLookup
	WebElement newTab;

	@FindBy(id = "country-select")
	@CacheLookup
	WebElement countryField;
	
	@FindBy(xpath = "//span[text()='Italy']")
	@CacheLookup
	WebElement italyOption;
	
	@FindBy(xpath = "//li[text()='B2B_MEL_Allianz_global']")
	@CacheLookup
	WebElement productNameOption;
	
	@FindBy(xpath = "//li[text()='1-34-B2B_MEL_Allianz_global-D-35-EUR-v1-MEL']")
	@CacheLookup
	WebElement tariffOption;
	
	@FindBy(xpath = "//li[text()='CATEGORY_MEL']")
	@CacheLookup
	WebElement insuranceCategoryOption;
	
	@FindBy(xpath = "//li[text()='24 month(s)']")
	@CacheLookup
	WebElement period24MonthOption;
	
	@FindBy(xpath = "//span[text()='One-time']")
	@CacheLookup
	WebElement paymentTypeOption;
	
	@FindBy(xpath = "//li[text()='250 - EUR 250.00']")
	@CacheLookup
	WebElement classOption;
	
	@FindBy(xpath = "//span[text()='France']")
	@CacheLookup
	WebElement franceOption;

	@FindBy(id = "product-name-select")
	@CacheLookup
	WebElement productNameField;
	
	@FindBy(id = "tariff-name-select")
	@CacheLookup
	WebElement tariffField;
	
	@FindBy(id = "category-name-select")
	@CacheLookup
	WebElement insuranceCategoryField;
	
	@FindBy(id = "duration-select")
	@CacheLookup
	WebElement periodField;
	
	@FindBy(id = "frequency-select")
	@CacheLookup
	WebElement paymentTypeField;
	
	@FindBy(id = "class-name-select")
	@CacheLookup
	WebElement classField;
	
	@FindBy(id = "input-createCertificate_serialNumber")
	@CacheLookup
	WebElement serialNumbertxt;
	
	@FindBy(id = "input-createCertificate_deviceName")
	@CacheLookup
	WebElement deviceNametxt;
	
	@FindBy(id = "input-createCertificate_invoiceNumber")
	@CacheLookup
	WebElement invoiceNumbertxt;
	
	@FindBy(id = "input-createCertificate_orderNumber")
	@CacheLookup
	WebElement orderNumbertxt;
	
	@FindBy(xpath = "//span[text()='Next']")
	@CacheLookup
	WebElement nextBtn;
	
	@FindBy(id = "input-createCertificate_firstName")
	@CacheLookup
	WebElement firstNametxt;
	
	@FindBy(id = "input-createCertificate_lastName")
	@CacheLookup
	WebElement lastNametxt;
	
	@FindBy(id = "input-createCertificate_email")
	@CacheLookup
	WebElement emailtxt;
	
	@FindBy(id = "input-createCertificate_streetName")
	@CacheLookup
	WebElement streetNametxt;
	
	@FindBy(id = "input-createCertificate_streetNumber")
	@CacheLookup
	WebElement houseNumbertxt;
	
	@FindBy(id = "input-createCertificate_zip")
	@CacheLookup
	WebElement postalCodetxt;
	
	@FindBy(id = "input-createCertificate_city")
	@CacheLookup
	WebElement citytxt;
	
	@FindBy(id = "input-createCertificate_country")
	@CacheLookup
	WebElement countrytxt;
	
	@FindBy(id = "input-createCertificate_taxCode")
	@CacheLookup
	WebElement taxCodetxt;
	
	@FindBy(xpath = "(//input[@type='checkbox' and @class='jss99'])[1]")
	@CacheLookup
	WebElement confirmationFirstCheckBox;
	
	@FindBy(xpath = "(//input[@type='checkbox' and @class='jss99'])[2]")
	@CacheLookup
	WebElement confirmationSecondCheckBox;
	
	@FindBy(xpath = "(//input[@type='checkbox' and @class='jss99'])[3]")
	@CacheLookup
	WebElement confirmationThirdCheckBox;
	
	@FindBy(xpath = "(//input[@type='checkbox' and @class='jss99'])[4]")
	@CacheLookup
	WebElement confirmationFourthCheckBox;
	
	@FindBy(xpath = "//span[text()='Create insurance']")
	@CacheLookup
	WebElement createInsurancebtn;
	
	@FindBy(xpath = "//input[@value='STRIPE.CARD']")
	@CacheLookup
	WebElement creditCardRadiobtn;
	

	@FindBy(xpath = "//span[text()='Continua con il pagamento']")
	@CacheLookup
	WebElement continuePaymentbtn;
	
	
	@FindBy(xpath = "//input[@name='cardnumber']")
	@CacheLookup
	WebElement cardNumbertxt;
	
	@FindBy(xpath = "//input[@name='exp-date']")
	@CacheLookup
	WebElement expiryDatetxt;
	
	@FindBy(xpath = "//input[@name='cvc']")
	@CacheLookup
	WebElement cvctxt;
	
	@FindBy(xpath = "//span[text()='Invia ordine']")
	@CacheLookup
	WebElement orderbtn;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[1]/table/tbody/tr[1]/td[2]/div/span")
	@CacheLookup
	WebElement createStatus;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[1]/table/tbody/tr[2]/td[2]/div")
	@CacheLookup
	WebElement certificateNum;
	
	public void clickNewTab()
	{
		newTab.click();
	}
	
	public void clickCountryField()
	{
		countryField.click();
	}
	
	public void clickItalyOption()
	{
		italyOption.click();
	}
	
	public void clickProductNameField()
	{
		productNameField.click();
	}
	
	public void clickProductNameOption()
	{
		productNameOption.click();
	}
	
	public void clickTariffField()
	{
		tariffField.click();
	}
	
	public void clickTariffOption()
	{
		tariffOption.click();
	}
	
	public void clickInsuranceCategoryField()
	{
		insuranceCategoryField.click();
	}
	
	public void clickInsuranceCategoryOption()
	{
		insuranceCategoryOption.click();
	}
	
	public void clickPeriodField()
	{
		periodField.click();
	}
	
	public void clickPeriod24MonthOption()
	{
		period24MonthOption.click();
	}
	
	public void clickPaymentTypeField()
	{
		paymentTypeField.click();
	}
	
	public void clickPaymentTypeOption()
	{
		paymentTypeOption.click();
	}
	
	public void clickClassField()
	{
		classField.click();
	}
	
	public void clickClassOption()
	{
		classOption.click();
	}
	
	public void setSerialNumber(String serialNo)
	{
		serialNumbertxt.sendKeys(serialNo);
	}
	
	public void setDeviceName(String deviceName)
	{
		deviceNametxt.sendKeys(deviceName);
	}
	
	public void setInvoiceNumber(String invoiceNo)
	{
		invoiceNumbertxt.sendKeys(invoiceNo);
	}
	
	public void setOrderNumber(String orderNo)
	{
		orderNumbertxt.sendKeys(orderNo);
	}
	
	public void clickNextBtn()
	{
		nextBtn.click();
	}
	
	public void setFirstNametxt(String orderNo)
	{
		firstNametxt.sendKeys(orderNo);
	}
	public void setLastNametxt(String orderNo)
	{
		lastNametxt.sendKeys(orderNo);
	}
	
	public void setEmailtxt(String orderNo)
	{
		emailtxt.sendKeys(orderNo);
	}
	
	public void setStreetNametxt(String orderNo)
	{
		streetNametxt.sendKeys(orderNo);
	}
	
	public void setHouseNumbertxt(String orderNo)
	{
		houseNumbertxt.sendKeys(orderNo);
	}
	
	public void setPostalCodetxt(String orderNo)
	{
		postalCodetxt.sendKeys(orderNo);
	}
	
	public void setCitytxt(String orderNo)
	{
		citytxt.sendKeys(orderNo);
	}
	
	public void setCountrytxt(String orderNo)
	{
		countrytxt.sendKeys(orderNo);
	}
	
	public void setTaxCodetxt(String orderNo)
	{
		taxCodetxt.sendKeys(orderNo);
	}
	
	public void clickConfirmationFirstCheckBox()
	{
		confirmationFirstCheckBox.click();
	}
	
	public void clickConfirmationSecondCheckBox()
	{
		confirmationSecondCheckBox.click();
	}
	
	public void clickConfirmationThirdCheckBox()
	{
		confirmationThirdCheckBox.click();
	}
	
	public void clickConfirmationFourthCheckBox()
	{
		confirmationFourthCheckBox.click();
	}
	
	public void clickCreateInsurancebtn()
	{
		createInsurancebtn.click();
	}
	
	public void clickCreditCardRadiobtn()
	{
		creditCardRadiobtn.click();
	}
	
	public void clickContinuePaymentbtn()
	{
		continuePaymentbtn.click();
	}
	
	public void setCardNumbertxt(String cardNo)
	{
		cardNumbertxt.sendKeys(cardNo);
	}
	
	public void setExpiryDatetxt(String expiryDate)
	{
		expiryDatetxt.sendKeys(expiryDate);
	}
	
	public void setcvctxt(String cvc)
	{
		cvctxt.sendKeys(cvc);
	}
	
	public void clickOrderbtn()
	{
		orderbtn.click();
	}
	
	public void switchFrame() {
		ldriver.switchTo().frame(0);
	}
	
	public void switchToParent() {
		ldriver.switchTo().parentFrame();
	}
	
	public String getCreatePolicyStatus() {
		String status = createStatus.getText();
		
		return status;
	}
	
	public String getCertificateNum() {
		String certNum = certificateNum.getText();
		
		return certNum;
	}
	
	

}
