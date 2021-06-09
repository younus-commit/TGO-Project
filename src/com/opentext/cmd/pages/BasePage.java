package com.opentext.cmd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.opentext.cmd.libraries.Generics;

public class BasePage {
Generics generic=new Generics();
	
	public BasePage(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//div[@id='logo']")
	private WebElement dashboard;
	
	@FindBy(xpath="//a[@id='iat']")
	private WebElement internalToolTab;
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	private WebElement logOut;
	@FindBy(xpath="//input[@id='Submit']")
	private WebElement signinbtn;
	
	
	public void verifyTGODashboard(){
		
		String ExpectedTitle = internalToolTab.getText();
		String ActualTitle = "Internal Admin Tool";
		System.out.println("++++++++++++++ExpectedTitle++++++++++++++"+ ExpectedTitle);
		if (dashboard.isDisplayed()) {
			
			System.out.println("Dashboard is displayed");
			Assert.assertEquals(ActualTitle, ExpectedTitle);
		} else {
			System.out.println("Dashboard is not sdisplayed");
		}
		
	
	}
	public void logOut(){
		logOut.click();
		
	
	
	}
}
