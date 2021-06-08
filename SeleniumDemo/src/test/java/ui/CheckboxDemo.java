package ui;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.tools.javac.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;
public class CheckboxDemo {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\DriverBrowser\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize(); 	
		
		WebElement radio=driver.findElement(By.id("doi0"));
		Actions actions=new Actions(driver);
		actions.moveToElement(radio);
		actions.perform();
		
		driver.findElement(By.name("interest_market_c")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("interest_market_c")).click();
		
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		
	}

}
