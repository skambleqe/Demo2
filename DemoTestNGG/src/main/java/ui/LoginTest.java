package ui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
 
@BeforeTest
    public void loginToApplication() {
	System.out.println("Login To Application");
}
@AfterTest
    public void logOutFromAplication() {
	System.out.println("Log Out From Aplication");
}
@BeforeMethod
    public void DBConnect() {
	System.out.println("DB Connected");
}
@AfterMethod
    public void DBDisconnect() {
	System.out.println("DB Disconnected");
}
@Test(priority=1,description="This is for Login purpose")

	public void aTest1() {
		System.out.println("Test1");
	}
@Test(priority=2,description="This is for Log out purpose")
    public static void aTest2() {
    	System.out.println("Test2");
    }
}
