package com.crm.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.BeforeLoginpage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginpageTest extends TestBase{

	BeforeLoginpage beforeLoginPage;
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginpageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialisation();
		beforeLoginPage = new BeforeLoginpage();
		loginPage = beforeLoginPage.login();
	}
	
	@Test(priority=1)
	public void loginPgTitleTest() {
		String title = loginPage.validateTitle();
		Assert.assertEquals(title, "Cogmento CRM");
	}
	
	@Test(priority=2)
	public void loginTest() {
		homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));	
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
