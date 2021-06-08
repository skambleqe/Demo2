import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClass2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\DriverBrowser\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");

	}

}
