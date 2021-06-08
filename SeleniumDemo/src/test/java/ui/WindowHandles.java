package ui;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\DriverBrowser\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/?ir=1");
		driver.manage().window().maximize(); 	
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/div/div/div[2]/div[1]/div[1]/div[3]/div/div[1]/div/a")).click();
		Thread.sleep(2000);
		Set<String> windowHandles= driver.getWindowHandles();
		System.out.println(windowHandles);
		Iterator<String> iterator= windowHandles.iterator();
		String parentWindow=iterator.next();
		String childWindow= iterator.next();
		driver.switchTo().window(childWindow);
		
		driver.findElement(By.name("UserFirstName")).sendKeys("Sandip");
		Thread.sleep(2000);
		driver.findElement(By.name("UserLastName")).sendKeys("Kamble");
		Thread.sleep(2000);
		driver.switchTo().window(parentWindow);
	}

}
