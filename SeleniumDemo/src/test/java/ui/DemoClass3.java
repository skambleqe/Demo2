package ui;
//import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import com.sun.tools.javac.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;
public class DemoClass3 {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\DriverBrowser\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize(); 	
		
		/*WebElement wb=driver.findElement(By.xpath("//*[@id=\"field27\"]/div/select"));
		Select slect=new Select(wb);
		slect.selectByValue("level2");
		Thread.sleep(2000);
		
		slect.selectByIndex(4);
		Thread.sleep(2000);
		
		slect.selectByVisibleText("51 - 100 employees");
		Thread.sleep(2000);*/
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		WebElement we= driver.findElement(By.id("multi-select"));
		Select selectItm=new Select(we);
		selectItm.selectByValue("California");
		Thread.sleep(2000);
		
		selectItm.selectByIndex(4);
		Thread.sleep(2000);

		java.util.List<WebElement> lstWeb=selectItm.getAllSelectedOptions();
		System.out.println(lstWeb);
		
		selectItm.deselectAll();
		Thread.sleep(2000);
		java.util.List<WebElement> lstWeb1=selectItm.getAllSelectedOptions();
		System.out.println(lstWeb1);
		
		selectItm.selectByValue("California");
		Thread.sleep(2000);
		
		selectItm.selectByIndex(4);
		Thread.sleep(2000);

		selectItm.deselectByIndex(4);
		
	}

}
