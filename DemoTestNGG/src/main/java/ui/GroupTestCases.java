package ui;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import Common.CommonDemo;

public class GroupTestCases extends CommonDemo{
 
	@BeforeClass
	public void beforeClass() {
		System.out.println("Run this Before Class");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("Run this After Class");
	}
	@BeforeGroups(value="regression")
	public void beforeGroup() {
		System.out.println("Run this Before Group");
	}
	@Test(groups= {"regression","bvt"})
    public void aTest1() {
	System.out.println("Test1");
}
@Test 
    public void aTest2() {
	System.out.println("Test2");
	Assert.assertTrue(false);
}
@Test(groups="regression")

	public void aTest3() {
		System.out.println("Test3");
	}
@Test(groups= {"regression","bvt"})
    public static void aTest4() {
    	System.out.println("Test4");
    }
}
