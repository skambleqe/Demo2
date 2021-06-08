package ui;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenShotDemo extends DemoListener{

	public void getScreenShot() throws IOException {
		Date currentDate = new Date();
		String dateStamp = currentDate.toString().replace(" ", "-").replace(":", "-"); 
		File screenShotFile =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenShotFile, new File(".//ScreenShot//"+dateStamp+".png"));
	}
}
