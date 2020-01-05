package com.zest.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zest.qa.base.TestBase;
import com.zest.qa.pages.AmazonDevicePage;
import com.zest.qa.pages.AmazonHomePage;
import com.zest.qa.pages.FlipkartDevicePage;
import com.zest.qa.pages.FlipkartHomePage;
import com.zest.qa.util.TestUtil;

public class ComparePrice extends TestBase
{
	AmazonHomePage amazonHomePage;
	AmazonDevicePage amazonDevicePage;
	FlipkartHomePage flipkartHomePage;
	FlipkartDevicePage flipkartDevicePage;

	public ComparePrice()
	{
		super();
	}

	@BeforeMethod
	public void setUp()
	{
		initialization();
		amazonHomePage = new AmazonHomePage();
	}

	@Test
	public void comparePrice()
	{
		amazonDevicePage = amazonHomePage.searchDevice();
		TestUtil.switchTab(1);
		int amazonDevicePrice = amazonDevicePage.getPrice();
		TestUtil.openNewTab();
		TestUtil.switchTab(2);
		driver.get(prop.getProperty("url2"));
		flipkartHomePage = new FlipkartHomePage();
		flipkartDevicePage = flipkartHomePage.searchDevice();
		TestUtil.switchTab(3);
		int flipkartDevicePrice = flipkartDevicePage.getPrice();
		TestUtil.finalResult(amazonDevicePrice, flipkartDevicePrice);
	}

	
	@AfterMethod
	public void tearDown()
	{ 
		  driver.quit(); 
	}
	 
}
