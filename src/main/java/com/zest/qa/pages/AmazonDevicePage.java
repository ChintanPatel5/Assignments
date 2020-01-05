package com.zest.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zest.qa.base.TestBase;

public class AmazonDevicePage extends TestBase
{

	@FindBy(xpath="//span[@id='priceblock_ourprice']")
	WebElement price;
	
	public AmazonDevicePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public int getPrice()
	{
		String amazonPrice= price.getText().replaceAll("[^a-zA-Z0-9_.]", "");
		int aPrice = (int)Double.parseDouble(amazonPrice);
		System.out.println("Amazon Device price is " + aPrice);
		return aPrice;
	}
}
