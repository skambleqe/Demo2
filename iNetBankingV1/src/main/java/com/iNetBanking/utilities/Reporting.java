package com.iNetBanking.utilities;

import java.io.File;
import java.io.IOException;
//import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
//import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporting extends TestListenerAdapter{
	
 public ExtentSparkReporter htmlReporter;
 public ExtentReports extent;
 public ExtentTest loggerTest;

public void onStart(ITestContext tc) {
	System.out.println("Starting Test");
	String timeStamp =new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	String RepName = "Test-Report-"+ timeStamp + ".html";
	 
	  htmlReporter= new ExtentSparkReporter(System.getProperty("user.dir")+"/test-output/"+RepName);
	  htmlReporter.loadXMLConfig(System.getProperty("user.dir")+"/src/test/resources/extent-config.xml");
	 System.out.println("Loading Extent");
	  htmlReporter.config().setDocumentTitle("INetBanking Test Project");
	  htmlReporter.config().setReportName("Functional Test Report");
	  htmlReporter.config().setTheme(Theme.DARK);
	  
	  extent = new ExtentReports();
	  extent.attachReporter(htmlReporter);
	  extent.setSystemInfo("Host Name","localhost");
	  extent.setSystemInfo("environment","QA");
	  extent.setSystemInfo("user","Sandip");
	  
	  
}

public void onTestSuccess(ITestContext tc) {
	loggerTest = extent.createTest(tc.getName());  //create new entry in the report
	loggerTest.log(Status.PASS, MarkupHelper.createLabel(tc.getName(), ExtentColor.GREEN));
}

public void onTestFailure(ITestContext tc) {
	loggerTest =extent.createTest(tc.getName());
	loggerTest.log(Status.FAIL, MarkupHelper.createLabel(tc.getName(), ExtentColor.RED));
	
	String screenShotPath = System.getProperty("user.dir")+"\\ScreenShots\\"+tc.getName()+".png";
	File f = new File(screenShotPath);
	
	if(f.exists()) {
		try {
			loggerTest.fail("ScreenShot is below"+loggerTest.addScreenCaptureFromPath(screenShotPath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public void onTestSkipped(ITestContext tc) {
	loggerTest = extent.createTest(tc.getName());
	loggerTest.log(Status.SKIP, MarkupHelper.createLabel(tc.getName(), ExtentColor.ORANGE));
}
}
