package DemoBaseClass;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterClass;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseDemo {

	public String urlBase = "https://login.salesforce.com/";
	public String username = "sandip_kamble@silvermicrosystems.com";
	public String password = "Silvermicrosystems@2021";
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		logger = Logger.getLogger(BaseDemo.class);
		PropertyConfigurator.configure("log4j.properties");
	}
	
	/*@AfterClass
	public void tearDown() {
		driver.quit();
	}*/
}
