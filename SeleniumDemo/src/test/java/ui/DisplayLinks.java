package ui;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DisplayLinks {

	public static void main(String[] args) {
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\DriverBrowser\\chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();

		java.util.List<WebElement> aList = driver.findElementsByTagName("a");
        System.out.println("Total Links::"+aList.size());
        
        for(int i=0;i<aList.size();i++) {
        	System.out.println("Link are: "+aList.get(i).getAttribute("href"));
        	System.out.println("Label on Link:"+aList.get(i).getText());
        }
		driver.close();
	}

}
