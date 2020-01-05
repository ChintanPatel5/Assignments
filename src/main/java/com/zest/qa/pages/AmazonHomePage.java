package com.zest.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zest.qa.base.TestBase;

public class AmazonHomePage extends TestBase
{

	@FindBy(id="twotabsearchtextbox")
	WebElement deviceSearch;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement clickSearch;
	
	@FindBy(xpath="//span[contains(text(),'Apple iPhone XR (64GB) - Yellow')]")
	WebElement clickOnDeviceLink;
	
	public AmazonHomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public AmazonDevicePage searchDevice()
	{
		deviceSearch.sendKeys(prop.getProperty("device"));
		clickSearch.click();
		clickOnDeviceLink.click();
		return new AmazonDevicePage();
	}
}
