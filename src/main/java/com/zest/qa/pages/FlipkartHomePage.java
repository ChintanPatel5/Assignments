package com.zest.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zest.qa.base.TestBase;

public class FlipkartHomePage extends TestBase
{
	@FindBy(xpath="//button[contains(text(),'✕')]")
	WebElement closePopUp;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement searchDevice;
	
	@FindBy(xpath="//input[@type='text']/buttton")
	WebElement clickSearch;
	
	@FindBy(xpath="//div[@class='_3wU53n']")
	WebElement clickOnDeviceLink;
	
	public FlipkartHomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public FlipkartDevicePage searchDevice()
	{
		closePopUp.click();
		searchDevice.sendKeys(prop.getProperty("device"));
		searchDevice.sendKeys(Keys.ENTER);
		clickOnDeviceLink.click();
		return new FlipkartDevicePage();
	}
}
