package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertDemo {
    @Test
	public void testTitle() {
		String exectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		String expectedText = "Searchtgfh";
		SoftAssert softAssert= new SoftAssert();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize(); 	
		String actualTitle = driver.getTitle();
		System.out.println("Verifying Title");
		//Assert.assertEquals(actualTitle, exectedTitle,"Title Verification Failed");
		softAssert.assertEquals(actualTitle, exectedTitle,"Title Verification Failed");
		String actualText = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
		System.out.println("Verifying Text");
		//Assert.assertEquals(actualText, expectedText, "Text Verification Failed");
		softAssert.assertEquals(actualText, expectedText, "Text Verification Failed");
		System.out.println("Closing Browser");
		driver.close();
		softAssert.assertAll();
	}
}
