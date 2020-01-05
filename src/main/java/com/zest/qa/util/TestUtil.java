package com.zest.qa.util;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;

import com.zest.qa.base.TestBase;

public class TestUtil extends TestBase
{
	public static long pageLoad_timeout= 20;
	public static long implicitelyWait_timeout=10;
	
	public static void switchTab(int tabNo)
	{
		 ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs2.get(tabNo));
		    //driver.close();
		  //  driver.switchTo().window(tabs2.get(0));
	}
	
	public static void openNewTab()
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.open()");
		//driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		
	}
	
	public static void finalResult(int aPrice, int fPrice)
	{
		if(aPrice>fPrice)
		{
			System.out.println("Flipkart have lesser value for Device.");
		}
		else if(fPrice>aPrice)
		{
			System.out.println("Amazon have lesser value for Device.");
		}
		else if(aPrice==fPrice)
		{
			System.out.println("Both have same price for Device.");
		}
	}
}
