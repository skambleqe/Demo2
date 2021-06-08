package ui;
//import java.util.Set;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.sun.tools.javac.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;
public class AutoSuggestedDdown {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\DriverBrowser\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize(); 	
		
		driver.findElement(By.xpath("//*[@id=\"field7\"]/div/input")).sendKeys("Sandip");
		driver.findElement(By.xpath("//*[@id=\"field7\"]/div/input")).clear();
		System.out.println(driver.findElement(By.name("firstname")).getAttribute("class"));
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getCssValue("text-transform"));
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getSize());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getLocation());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getTagName());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).isSelected());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field29\"]/label")).getText());
		driver.close();
	}

}
