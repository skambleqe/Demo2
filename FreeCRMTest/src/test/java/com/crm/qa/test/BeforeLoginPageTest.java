package com.crm.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.BeforeLoginpage;
import com.crm.qa.pages.LoginPage;

public class BeforeLoginPageTest extends TestBase{

	BeforeLoginpage beforLoginPage;
	LoginPage loginPage;
	
	public BeforeLoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialisation();
		beforLoginPage = new BeforeLoginpage();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest() {
		String title = beforLoginPage.validateTitle();
		Assert.assertEquals(title, "#1 Free CRM customer relationship management software cloud");
	}
	
	@Test(priority=2)
	public void loginTest() {
		loginPage = beforLoginPage.login();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
