package com.opentext.cmd.libraries;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Generics {
	WebDriver driver;

	public void enterText(String locatortype,String locator, String usernametxt) {
		// TODO Auto-generated method stub
		if (locatortype.equals("xpath")) {
			driver.findElement(By.xpath(locator)).click();
			driver.findElement(By.xpath(locator)).clear();
			driver.findElement(By.xpath(locator)).sendKeys(usernametxt);
		}
		else if(locatortype.equals("css")) {
			driver.findElement(By.cssSelector(locator)).click();
			driver.findElement(By.cssSelector(locator)).clear();
			driver.findElement(By.cssSelector(locator)).sendKeys(usernametxt);
		}
		else if(locatortype.equals("id")) {
			driver.findElement(By.id(locator)).click();
			driver.findElement(By.id(locator)).clear();
			driver.findElement(By.id(locator)).sendKeys(usernametxt);
		}
		else if(locatortype.equals("name")) {
			driver.findElement(By.name(locator)).click();
			driver.findElement(By.name(locator)).clear();
			driver.findElement(By.name(locator)).sendKeys(usernametxt);
		}
		else if(locatortype.equals("classname")) {
			driver.findElement(By.className(locator)).click();
			driver.findElement(By.className(locator)).clear();
			driver.findElement(By.className(locator)).sendKeys(usernametxt);
		}
		
	}

	public void  clickOnElement(String locatortype,String locator){
		if (locatortype.equals("xpath")) {
			driver.findElement(By.xpath(locator)).click();

		}
		else if(locatortype.equals("css")) {
			driver.findElement(By.cssSelector(locator)).click();
			
		}
		else if(locatortype.equals("id")) {
			driver.findElement(By.id(locator)).click();
		
		}
		else if(locatortype.equals("name")) {
			driver.findElement(By.name(locator)).click();
		
		}
		else if(locatortype.equals("classname")) {
			driver.findElement(By.className(locator)).click();

		}
		
	}
	public String property(String path,String sProperty)
	{
		String sValue=null;
		Properties prop = new Properties();
		File fl = new File(path);
		FileInputStream fn = null;
		try
		{
			fn = new FileInputStream(fl);
			prop.load(fn);
		}catch(Exception e)
		{

		}
		sValue=prop.getProperty(sProperty);

		return sValue;
	}

	

}
