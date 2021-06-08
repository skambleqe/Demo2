package ui;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class AccountSetUp {

	@DataProvider(name="AccountData")
	public Object[][] setUpAccounts(Method m){
		Object[][] testData=null;
	    if(m.getName().equals("testData1")) {
	    	testData = new Object[][] {
	    		{"Sandy","Kamble"},
	    		{"Ahaan","Kamble"},
	    		{"rita","JibhKamble"},
	    		{"Aradhya","Kamble"}
	    	};
	    }
	    else if(m.getName().equals("testData2")) {
	    	testData = new Object[][] {
	    		{"Dipak","Aakre","T5635"},
	    		{"Sanjay","Kamble","AD5628"}
	    	};
	    }
		return testData;
    }
	
}
