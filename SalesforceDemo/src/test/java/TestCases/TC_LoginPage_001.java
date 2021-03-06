package TestCases;

//import org.testng.Assert;
import org.testng.annotations.Test;

import DemoBaseClass.BaseDemo;
import PagesSalesforce.LoginPage;

public class TC_LoginPage_001 extends BaseDemo{

	@Test
	public void loginPgTest() throws InterruptedException {
		driver.get(urlBase);
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setUserName(username);
		logger.info("Entered UserName");
		loginPage.setPassword(password);
		logger.info("Entered Password");
		loginPage.subminLoginBtn();
		logger.info("Pressed login");
		Thread.sleep(2000);
		
		System.out.println(driver.getPageSource().contains("Register Your Mobile Phone"));
		if(driver.getPageSource().contains("Register Your Mobile Phone")) {
			loginPage.clickRemind();
			logger.info("clicked remind");
		}
		
				
		/*loginPage.clickApplaunch();
		logger.info("Click applaunch");
		
		loginPage.navigateToAccount();
		logger.info("View All Section");*/
		
		/*if(driver.getTitle().equals("Login | Salesforce")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}*/
		
		
	}
}
