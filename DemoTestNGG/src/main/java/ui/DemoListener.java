package ui;

import org.testng.Assert;
import org.testng.annotations.Test;

import Common.BaseTest;

public class DemoListener extends BaseTest {

	@Test(retryAnalyzer = Common.Retry.class)
	public void launchApp() {
		driver.get("https://www.ebay.com/");
		Assert.assertTrue(false);
	}
}
