package Common;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import ui.ScreenShotDemo;

public class Listeners extends ScreenShotDemo implements ITestListener {

	public void onTestStart(ITestResult result) {
		Reporter.log("Method Name is-"+result.getName());
		
		System.setProperty("org.uncommons.reportng.title", "Sandip Academy");
        System.out.println("Test Case is Starting");
	}

	public void onTestSuccess(ITestResult result) {
	   Reporter.log("Status of Execution-"+result.getStatus());			
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed-ScreenShot Captured");
		try {
			getScreenShot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   System.setProperty("org.uncommons.reportng.escape-output", "false");
       Reporter.log("<a href=\"D:\\Eclipse_Workspace\\DemoTestNGG\\ScreenShot\\Tue-May-25-15-31-34-IST-2021.png\">Test Result</a>");
	}
}
