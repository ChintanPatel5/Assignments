package com.zest.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zest.qa.base.TestBase;

public class FlipkartDevicePage extends TestBase
{
	
	@FindBy(xpath="//div[@class='_1vC4OE _3qQ9m1']")
	WebElement price;
	
	public FlipkartDevicePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public int getPrice()
	{
		String flipkartPrice = price.getText().replaceAll("\\W", "");
		int fPrice = Integer.parseInt(flipkartPrice);
		System.out.println("Flikart Device Price is " + fPrice);
		return fPrice;
	}
}
