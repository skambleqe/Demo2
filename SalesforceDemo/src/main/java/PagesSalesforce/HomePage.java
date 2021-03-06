package PagesSalesforce;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
 
	WebDriver ldriver;
	@FindBy(xpath="//div[contains(@class,'appLauncher')]//button")
	WebElement applaunch;
	
	@FindBy(xpath="//button[text()='View All']")
	WebElement viewAll;
	
	@FindBy(xpath="//a[@data-label='Accounts' and @class='al-tab-item']")
	WebElement accounts;
	
	@FindBy(xpath="//a[@title='New' and @class='forceActionLink']")
	WebElement NewBtn;
	
	public void jsClick(WebElement elem) {
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", elem);
		try {
			Thread.sleep(1000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public HomePage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void appLaunch() {
		jsClick(applaunch);
	}
	public void navigateToAccount() {
		jsClick(viewAll);
		jsClick(accounts);
	}
	
}
