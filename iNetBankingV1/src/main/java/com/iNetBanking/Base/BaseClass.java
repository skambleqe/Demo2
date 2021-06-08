package com.iNetBanking.Base;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
//import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import com.iNetBanking.utilities.ReadConfig;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	ReadConfig readConfig = new ReadConfig();
	public String BaseUrl = readConfig.getUrl();
	//public String BaseUrl = "https://www.demo.guru99.com/v4/";
	public String username = readConfig.getUserName();
	public String password = readConfig.getPassword();
	public static WebDriver driver;
	public static Logger logger;
	
	@Parameters("browser")
    @BeforeClass
	public void setUp(String br) {
		//logger.info("Entered for Chrome browser");
		if(br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+readConfig.getDriverPath());  //system.getProperty("user.dir) -[Project directory] D:/Eclipse_Workspace/iNetBankingV1
	    	driver = new ChromeDriver();
    	}
    	else if(br.equals("firefox")) {
    		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+readConfig.getDriverPath());  //system.getProperty("user.dir) -[Project directory] D:/Eclipse_Workspace/iNetBankingV1
        	driver = new FirefoxDriver();
    	}
		
    	driver.manage().deleteAllCookies();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	
    	
    	logger = Logger.getLogger("TC_LoginTest_001");
    	//PropertyConfigurator.configure("log4j.properties");
    	
    }
    
    @AfterClass
        public void tearDown() {
    	driver.quit();
    }
    
    public void capureScreenShots(WebDriver driver,String tName) throws IOException {
    	TakesScreenshot ts = (TakesScreenshot)driver;
    	File source = ts.getScreenshotAs(OutputType.FILE);
    	File target = new File(System.getProperty("user.dir")+"./ScreenShots/"+tName+".png");
    	FileUtils.copyFile(source, target);
    	System.out.println("ScreenShot Taken");
    }
}
