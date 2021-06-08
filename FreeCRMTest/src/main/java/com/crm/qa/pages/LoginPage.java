package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{

	@FindBy(xpath="//*[@id=\"ui\"]/div/div/form/div/div[1]/div/input")
	WebElement username;
	
	@FindBy(xpath="//*[@id=\"ui\"]/div/div/form/div/div[2]/div/input")
	WebElement password;
	
	@FindBy(xpath="//div[contains(text(),'Login')]")
	WebElement logBtn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateTitle() {
		return driver.getTitle();
	}
	
	public HomePage login(String un,String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		logBtn.click();
		return new HomePage();
	}
}
