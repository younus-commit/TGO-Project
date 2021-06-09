package com.opentext.cmd.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.opentext.cmd.libraries.Generics;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class BaseClass {


	WebDriver driver;


	public ExtentReports extent;
	public ExtentTest test;
	Generics generic=new Generics();
	@BeforeSuite
	public void suitestart(){
		extent = new ExtentReports("./Reports/index.html");
		extent.config()
		.documentTitle("Automation Test Report")
		.reportName("OpenText AutomationTestReport");

	}
	@Parameters({"browser"})
	@BeforeClass
	public void setup(String browser){
		if (browser.equals("GC")) {
			System.setProperty("webdriver.chrome.driver", "./Exe/chromedriver.exe");
			driver=new ChromeDriver();
			//	test.log(LogStatus.PASS, "Chrome Browser is lanched");
			//test = extent.startTest("ASP BULK UPLOAD MCQ2", "test_create_businessunit2");
		} else {
			System.setProperty("webdriver.chrome.driver", "./Exe/chromedriver.exe");
			driver=new ChromeDriver();
			//	test.log(LogStatus.PASS, "Fire fox Browser is lanched");
			/* System.setProperty("webdriver.gecko.driver", "./Exe/geckodriver.exe");
			 driver=new FirefoxDriver();*/
		} 

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(generic.property("./src/Config.properties.txt", "Tgourl"));
		//	test.log(LogStatus.PASS, "Navigated to URL "+generic.property("./src/Config.properties.txt", "Tgourl") );

	}


	@AfterMethod
	public void afterMethod(){
		extent.endTest(test);
	}
	@AfterClass
	public void teardown(){
		driver.quit();

		extent.flush();
	}

	@BeforeSuite
	public void suiteend(){
		//extent.endTest(test);
		//  extent.flush();

	}


}
