package ui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class TableHandle {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\DriverBrowser\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www2.asx.com.au/");
		driver.manage().window().maximize(); 	
		
		//WebElement table = driver.findElement(By.xpath("//*[@id=\"home_top_five\"]/div/div/div/div[1]/table"));
		java.util.List<WebElement> rowElements= driver.findElements(By.xpath("//*[@id=\"home_top_five\"]/div/div/div/div[1]/table/tbody/tr"));
		int rowSize=rowElements.size();
		java.util.List<WebElement> colsElements= driver.findElements(By.xpath("//*[@id=\"home_top_five\"]/div/div/div/div[1]/table/tbody/tr[1]/td"));
		int colsSize = colsElements.size();
		System.out.println(rowSize);
		System.out.println(colsSize);
		
		for(int r=1;r<rowSize;r++) {
			for( int c=1;c<colsSize;c++) {
				System.out.print(driver.findElements(By.xpath("//*[@id=\"home_top_five\"]/div/div/div/div[1]/table/tbody/tr[r]/td[c]")));
			}
			System.out.println();
		}
	}

}
