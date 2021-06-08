package ui;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;
public class DemoClass2 {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\DriverBrowser\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize(); 	
		String curUrl=driver.getCurrentUrl();
		System.out.println(curUrl);
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		java.util.List<WebElement> element= driver.findElements(By.xpath("//div[@class=\"inventory_list\"]/div"));
		System.out.println(element);
		
		driver.navigate().to("https://www.sugarcrm.com/au/");
		
		String wnHandle=driver.getWindowHandle();
		System.out.println(wnHandle);
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/div/div/div[1]/div[4]/a")).click();
		Set<String> winHandles= driver.getWindowHandles();
		System.out.println(winHandles);
		driver.close();
	}

}
