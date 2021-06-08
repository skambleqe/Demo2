package com.iNetBanking.TestCases;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
						
import com.iNetBanking.Base.BaseClass;
import com.iNetBanking.PageObject.LoginPage;

public class TC_LoginTest_001 extends BaseClass{

	@Test
	public void loginTest() throws IOException {
		
		driver.get(BaseUrl);
		
		logger.info("url is entered");
		LoginPage loginPage = new LoginPage();
		loginPage.setUserName(username);
		logger.info("UserName is entered");
		loginPage.setpassWord(password);
		
		loginPage.clickSubmit();
		
		if(driver.getTitle().equals("Swag Labs567")) {
			Assert.assertTrue(true);
			logger.info("Title is verified");
		}
		else {
			  capureScreenShots(driver,"loginTest");
		      Assert.assertTrue(false);
		}
	}
}
