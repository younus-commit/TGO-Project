package com.opentext.cmd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.opentext.cmd.libraries.Generics;
import com.opentext.cmd.scripts.BaseClass;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LoginPage {

	ExtentTest test;

	Generics generic=new Generics();

	public LoginPage(WebDriver driver, ExtentTest test){
		PageFactory.initElements(driver, this);
		this.test= test;
	}

	@FindBy(xpath="")
	private WebElement dashboard;

	@FindBy(xpath="//input[@id='username']")
	private WebElement usernametxt;
	@FindBy(xpath="//input[@id='password']")
	private WebElement passwordtxt;
	@FindBy(xpath="//input[@id='Submit']")
	private WebElement signinbtn;
	
	
	/* private String usernametxt="//input[@id='username']";
	 private String passwordtxt="//input[@id='password']";
	 private String signinbtn="//input[@id='Submit']";*/


	public void tgoLogin(){
		usernametxt.sendKeys(generic.property("./src/Config.properties.txt","user"));
		test.log(LogStatus.PASS, "User is Entered");
		passwordtxt.sendKeys(generic.property("./src/Config.properties.txt","pwd"));
		test.log(LogStatus.PASS, "Pwd is Entered");
		signinbtn.click();
		/*generic.enterText("xpath",usernametxt, generic.property("./src/Config.properties.txt","user"));
		generic.enterText("xpath",passwordtxt, generic.property("./src/Config.properties.txt","user"));
		generic.clickOnElement("xpath",signinbtn);*/

	}
	public void questionlogin(){
		/*generic.enterText(usernametxt, generic.property("./src/Config.properties.txt","user"));
		generic.enterText(passwordtxt, generic.property("./src/Config.properties.txt","user"));
		generic.clickOnElement(signinbtn);
*/


	}


}
