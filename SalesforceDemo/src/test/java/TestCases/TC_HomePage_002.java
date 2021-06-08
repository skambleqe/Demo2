package TestCases;

import org.testng.annotations.Test;

import DemoBaseClass.BaseDemo;
import PagesSalesforce.HomePage;

public class TC_HomePage_002 extends BaseDemo{

	@Test
	public void homePageTest() throws InterruptedException {
		TC_LoginPage_001 tcLoginPage = new TC_LoginPage_001();
		tcLoginPage.loginPgTest();
		HomePage homePage = new HomePage(driver);
		homePage.appLaunch();
		logger.info("Click applaunch");
		homePage.navigateToAccount();
		logger.info("View All Section");
		
	}
}
