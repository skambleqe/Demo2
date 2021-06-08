package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class BeforeLoginpage extends TestBase{

	//PageFactory -Object Repository
	@FindBy(xpath="/html/body/div[1]/header/div/nav/div[2]/div/a")
	WebElement loginBtn;
	
	@FindBy(xpath="/html/body/div[1]/main/section[1]/a")
	WebElement signUpBtn;
	
	//initializing the Page Object
	public BeforeLoginpage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String validateTitle() {
		return driver.getTitle();
	}
	
	public LoginPage login() {
		loginBtn.click();
		return new LoginPage();
	}
}

