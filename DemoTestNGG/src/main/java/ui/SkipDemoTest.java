package ui;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipDemoTest {
 Boolean dataSetUp=false;
@Test(enabled=false)
    public void aTest1() {
	System.out.println("Skiping the Test as its not complete");
}
@Test 
    public void aTest2() {
	System.out.println("Skipping this Test Forcefully");
	throw new SkipException("Skipping this Test");
}
@Test

	public void aTest3() {
		System.out.println("Skipping this Test based on condition");
		if(dataSetUp==true) {
			System.out.println("Execute the Test");
		}
		else {
			System.out.println("Do not execute further steps");
			throw new SkipException("Do not executes further steps");
		}
	}

}
