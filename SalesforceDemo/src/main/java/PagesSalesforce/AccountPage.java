package PagesSalesforce;

import org.openqa.selenium.By;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.Select;

public class AccountPage {

	WebDriver ldriver;
	boolean flag=false;
	//Define WebElements
	@FindBy(xpath="//a[@title='New' and @class='forceActionLink']")
	WebElement NewBtn;
	@FindBy(xpath="//input[@name='Name' or @id='input-156']")
	WebElement AccName;
	/*@FindBy(name="//input[@id=\"input-162\"][@name='AccountNumber']")
	WebElement AccNumber;*/
	@FindBy(xpath="//input[@name='Phone' or @id='input-158']")
	WebElement phone;
	//@FindBy(xpath="//*[@id=\"input-145\"]")
	@FindBy(xpath="/html/body//records-lwc-record-layout[@class='record-layout-container-bottom-padding']//child::input")
	WebElement ratingList;
	@FindBy(xpath="//span[@title='Hot' and text()='Hot']")
	WebElement optHot;
	@FindBy(xpath="//*[text()='Ownership']//parent::lightning-combobox//child::input")
	WebElement ownership;
	@FindBy(xpath="//*[@data-value='Private']")
	WebElement optPrivate;
	@FindBy(xpath="//a[@title='Accounts']")
	WebElement AccountLink;
	
	@FindBy(xpath="//button[@name='SaveEdit' and text()='Save']")
	WebElement SaveBtn;
	
	/*@FindBy(xpath="//*[@name='Account-search-input']")
	WebElement searchBox;*/
	@FindBy(xpath="//lightning-button-menu[@class='menu-button-item slds-dropdown-trigger slds-dropdown-trigger_click']")
	WebElement arrowBtn;
	/*@FindBy(xpath="//a[@title='Show 3 more actions']")
	WebElement arrowkey;*/
	@FindBy(xpath="//a[@title='Edit']")
	WebElement editBtn;
	@FindBy(xpath="//span[text()='Edit']")
	WebElement editLink;
			
	public AccountPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
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
	public void waitForElement(WebElement ele,long timesinSecod) {
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(ldriver,timesinSecod);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	/*public void jsSendKeys(WebElement elem,String val) {
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].value=val;", elem);
		try {
			Thread.sleep(1000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	public void newAccount() {
		jsClick(NewBtn);
	}
	public void fillAccount() throws InterruptedException {
		AccName.sendKeys("SilverMicro Systems12");
		
		phone.sendKeys("9978986743");
		//jsSendKeys(phone,"6745578956");
		Thread.sleep(1000);
	//For Select Hot option from Rating
		jsClick(ratingList);
		jsClick(optHot);
	//Select Private option from Ownership Picklist
		jsClick(ownership);
		jsClick(optPrivate);
		//AccNumber.sendKeys("6547838767");
		//jsSendKeys(AccNumber,"67455");
		Thread.sleep(1000);
		jsClick(SaveBtn);
		jsClick(AccountLink);
	//Search Account
		/*waitForElement(searchBox,10);
		jsClick(searchBox);
		searchBox.clear();
		searchBox.sendKeys("SilverCloud");
		
		jsClick(searchBox);
		searchBox.sendKeys(Keys.ENTER);
		//waitForElement(arrowkey,10);
		jsClick(arrowkey);*/
		//waitForElement(editBtn,10);
		//jsClick(editBtn);
	}
	public boolean foundAccount(String AccName) {
		//jsClick(AccountLink);
		WebElement webTable = ldriver.findElement(By.xpath("//*[@class=\"uiScroller scroller-wrapper scroll-bidirectional native\"]/div/div/table"));
		int rowCount = webTable.findElements(By.tagName("tr")).size();
		String beforXpath="//*[@class=\"uiScroller scroller-wrapper scroll-bidirectional native\"]/div/div/table/tbody/tr[";
		String afterXpath = "]/th";
		System.out.println(rowCount);
		for(int i=1;i<rowCount;i++) {
			String name = ldriver.findElement(By.xpath(beforXpath+i+afterXpath)).getText();
			System.out.println(name);
			if(name.contains(AccName)) {
				WebElement ele = ldriver.findElement(By.xpath(beforXpath+i+afterXpath+"//a"));
				jsClick(ele);
				flag=true;
				break;
			}
			
		}
		return flag;
		
	}
	
	public void editAccount() {
		//jsClick(arrowBtn);
		jsClick(editLink);
	}
	
}
