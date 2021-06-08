package com.iNetBanking.TestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.iNetBanking.Base.BaseClass;
import com.iNetBanking.PageObject.HomePage;
import com.iNetBanking.PageObject.LoginPage;

public class TC_HomePageTest_03 extends BaseClass{

	@Test
	public void homePageTest() throws IOException, InterruptedException {
		driver.get(BaseUrl);
		logger.info("url is entered");
		LoginPage loginPage = new LoginPage();
		loginPage.setUserName(username);
		logger.info("UserName is entered");
		loginPage.setpassWord(password);
		logger.info("Password is entered");
		loginPage.clickSubmit();
		
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		HomePage homePage = new HomePage(driver);
		homePage.selectSauceBagItem();
		
		if(homePage.isLogoAvailable()) {
			Assert.assertTrue(true);
			logger.info("Logo is Verified");
		}
		else {
			  capureScreenShots(driver,"homePageTest");
			  logger.info("Logo is Verification Failed");
			  Assert.assertTrue(false);
		    }
		Thread.sleep(2000);
		System.out.println(homePage.getTextSubmitBtn());
		homePage.clickBackBtn();
		Thread.sleep(2000);
	}
	
}
