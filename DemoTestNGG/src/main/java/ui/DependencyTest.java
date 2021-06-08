package ui;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTest {

	@Test
	public void userRegistration() {
		System.out.println("This is User Registration");
		Assert.assertTrue(false);
	}
	@Test(dependsOnMethods="userRegistration",alwaysRun=true)
	public void userSearch() {
		System.out.println("This is User Search");
	}
	@Test
	public void test1() {
		System.out.println("This is Test1");
	}
	@Test
	public void test2() {
		System.out.println("This is Test2");
	}
}
