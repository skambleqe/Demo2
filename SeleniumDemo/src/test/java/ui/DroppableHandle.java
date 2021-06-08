package ui;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class DroppableHandle {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\DriverBrowser\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().window().maximize(); 	
		
		WebElement frame= driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("/html/body/button")).click();
		
		Alert alertOnPage= driver.switchTo().alert();
		alertOnPage.sendKeys("Mady");
		
		alertOnPage.accept();
		
		driver.switchTo().parentFrame();
		
	}

}
