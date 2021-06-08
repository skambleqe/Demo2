package ui;

import org.testng.annotations.Test;

public class AccountTestCases {

	@Test(dataProvider="AccountData",dataProviderClass=AccountSetUp.class)
	public void testData1(String FName,String LName) {
		System.out.println(FName+"===="+LName);
	}
	@Test(dataProvider="AccountData",dataProviderClass=AccountSetUp.class)
	public void testData2(String FirstName,String lastName,String AccNumber) {
		System.out.println(FirstName+"==="+lastName+"======"+AccNumber);
	}
}
