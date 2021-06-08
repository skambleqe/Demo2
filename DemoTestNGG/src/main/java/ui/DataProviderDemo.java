package ui;


import org.testng.annotations.Test;

public class DataProviderDemo {
	@Test(dataProvider="create",dataProviderClass=DataProviderDemoMethod.class)
	public void test(String userName, String password) {
		System.out.println(userName+"======="+password);
	}
	
		
	@Test(dataProvider="create",dataProviderClass=DataProviderDemoMethod.class)
	public void test1(String userName, String password,String Text) {
		System.out.println(userName+"======="+password+"======="+Text);
	}
	
}
