package com.iNetBanking.PageObject;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.iNetBanking.Base.BaseClass;

public class LoginPage extends BaseClass{

	//WebDriver ldriver;
	
	public LoginPage() {
		//ldriver = rdriver;
		PageFactory.initElements(driver, this);
	}
	
	//Define Web Elements
	@FindBy(name="user-name")
	WebElement txtUserName;
	
	@FindBy(name="password")
	WebElement txtpassword;
	
	@FindBy(name="login-button") 
	WebElement btnLogin;
	
	//Actions
	public void setUserName(String uName) {
		txtUserName.sendKeys(uName);
	}
	public void setpassWord(String pwd) {
		txtpassword.sendKeys(pwd);
	}
	public void clickSubmit() {
		btnLogin.click();
	}
	
	
	
}


