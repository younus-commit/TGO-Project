package com.opentext.cmd.scripts;

import org.testng.annotations.Test;

import com.opentext.cmd.pages.BasePage;
import com.opentext.cmd.pages.LoginPage;
import com.relevantcodes.extentreports.LogStatus;

public class ptscripts extends BaseClass {


	@Test
	public void test_create_businessunit1(){
		test = extent.startTest("test_create_businessunit1", "test_create_businessunit1");
		LoginPage loginpage=new LoginPage(driver, test);
		loginpage.tgoLogin();
		//	test.log(LogStatus.PASS, "Login is complated");


	}
	@Test
	public void test_create_businessunit2(){
		test = extent.startTest("test_create_businessunit2", "test_create_businessunit2");
		BasePage basePage=new BasePage(driver);
		basePage.verifyTGODashboard();
		test.log(LogStatus.PASS, "Dshboard is complated");


	}
	@Test
	public void test_create_businessunit3(){
		test = extent.startTest("test_create_businessunit3", "test_create_businessunit3");
		BasePage basePage=new BasePage(driver);
		basePage.verifyTGODashboard();
		test.log(LogStatus.PASS, "Dshboard is complated");

	}
	@Test
	public void test_create_businessunit4(){
		test = extent.startTest("test_create_businessunit4", "test_create_businessunit4");
		BasePage basePage=new BasePage(driver);
		basePage.verifyTGODashboard();

		test.log(LogStatus.PASS, "Dshboard is complated");
	}
	@Test
	public void test_create_businessunit5(){
		test = extent.startTest("test_create_businessunit5", "test_create_businessunit5");
		BasePage basePage=new BasePage(driver);
		basePage.verifyTGODashboard();
		test.log(LogStatus.PASS, "Dshboard is complated");

	}
	@Test
	public void test_create_businessunit6(){
		test = extent.startTest("test_create_businessunit6", "test_create_businessunit6");
		BasePage basePage=new BasePage(driver);
		basePage.verifyTGODashboard();
		test.log(LogStatus.PASS, "Dshboard is complated");

	}
	@Test
	public void test_create_businessunit7(){
		test = extent.startTest("test_create_businessunit7", "test_create_businessunit7");
		BasePage basePage=new BasePage(driver);
		basePage.verifyTGODashboard();
		test.log(LogStatus.PASS, "Dshboard is complated");

	}
	@Test
	public void test_create_businessunit8(){
		test = extent.startTest("test_create_businessunit8", "test_create_businessunit8");
		BasePage basePage=new BasePage(driver);
		basePage.verifyTGODashboard();
		basePage.logOut();
		test.log(LogStatus.PASS, "Dshboard is complated");

	}

}
