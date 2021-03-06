package PagesSalesforce;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{

	WebDriver ldriver;
	@FindBy(id="username")
	WebElement userName;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"Login\"]")
	WebElement loginBtn;
	
	@FindBy(xpath="//a[text()='Remind Me Later']")
	WebElement remindLink;
	
	@FindBy(xpath="//div[contains(@class,'appLauncher')]//button")
	WebElement applaunch;
	
	@FindBy(xpath="//button[text()='View All']")
	WebElement viewAll;
	
	@FindBy(xpath="//a[@data-label='Accounts']")
	WebElement accounts;
	
	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	public void setUserName(String uName) {
		userName.sendKeys(uName);
	}
	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}
	public void subminLoginBtn() {
		loginBtn.click();
	}
	public void clickRemind() {
		remindLink.click();
	}
	
	public void jsClick(WebElement elem) {
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click();",elem);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void clickApplaunch() {
		//JavascriptExecutor js = (JavascriptExecutor)ldriver;
		//js.executeScript("arguments[0].click();",applaunch);
		jsClick(applaunch);
	}
	
	public void navigateToAccount() throws InterruptedException {
		//JavascriptExecutor js = (JavascriptExecutor)ldriver;
		//js.executeScript("arguments[0].click()", viewAll);
		jsClick(viewAll);
		//Thread.sleep(1000);
		jsClick(accounts);
		//js.executeScript("arguments[0].click()", accounts);
	}
}
