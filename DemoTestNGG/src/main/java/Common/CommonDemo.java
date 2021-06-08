package Common;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonDemo {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This executes Before Suite");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("This executes After Suite");
	}
}
