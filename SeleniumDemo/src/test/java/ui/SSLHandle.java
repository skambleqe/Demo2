package ui;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class SSLHandle {
    public static String userName="admin";
    public static String password="admin";
	public static void main(String[] args)  {
		//System.setProperty("webdriver.chrome.driver", "C:\\DriverBrowser\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
				
		WebDriver driver=new ChromeDriver();
		driver.get("https://"+userName+":"+password+"@the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize(); 
		
		
	}

} 
