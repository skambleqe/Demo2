package ui;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;
public class AuthenticationHandle {

	public static void main(String[] args) throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "C:\\DriverBrowser\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		DesiredCapabilities DC = new DesiredCapabilities();
		DC.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
		DC.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
		
		ChromeOptions cOpt = new ChromeOptions();
		cOpt.merge(DC);
		
		WebDriver driver=new ChromeDriver(cOpt);
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize(); 
		
		
	}

}
