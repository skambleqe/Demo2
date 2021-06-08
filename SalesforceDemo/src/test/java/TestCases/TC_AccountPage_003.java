package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import DemoBaseClass.BaseDemo;
import PagesSalesforce.AccountPage;

public class TC_AccountPage_003 extends BaseDemo{

	@Test
	public void AccountPgTest() throws InterruptedException {
		TC_HomePage_002 homePage = new TC_HomePage_002();
		homePage.homePageTest();
		AccountPage acPage = new AccountPage(driver);
		acPage.newAccount();
		logger.info("Click on Account");
		acPage.fillAccount();
		logger.info("filled Info");
		Boolean foundAcc = acPage.foundAccount("SilverCloud");
		if(foundAcc) {
			acPage.editAccount();
		}
		else {
			Assert.assertTrue(false);
		}
		
	}
}
