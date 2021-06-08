package ui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class RadioButtonDemo {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\DriverBrowser\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.singaporeair.com/en_UK/in/home#/book/bookflight");
		driver.manage().window().maximize(); 	
		
		WebElement radio1= driver.findElement(By.id("bookFlights"));
		WebElement radio2= driver.findElement(By.id("redeemFlights"));
		radio2.click();
		Thread.sleep(2000);
		System.out.println(radio1.isSelected());
		System.out.println(radio2.isSelected());
		
		System.out.println(driver.findElements(By.xpath("//*[@name='book-flight-radio']")).size());
	}

}
