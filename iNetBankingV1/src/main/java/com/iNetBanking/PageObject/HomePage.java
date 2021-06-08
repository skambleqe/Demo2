package com.iNetBanking.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver ldriver;
	@FindBy(xpath="//a[@id=\"item_4_title_link\"]")
	WebElement sauceBagItem;
	
	@FindBy(xpath="//div[@class='app_logo']")
	WebElement logo;
	
	@FindBy(id="back-to-products")
	WebElement backBtn;
	
	public HomePage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	public void selectSauceBagItem() {
		sauceBagItem.click();
	}
	
	public boolean isLogoAvailable() {
		return logo.isDisplayed();
	}
	
	public String getTextSubmitBtn() {
		return backBtn.getText();
	}
	
	public void clickBackBtn() {
		backBtn.click();
	}
}
