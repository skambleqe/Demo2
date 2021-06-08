package ui;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviderDemoMethod {
		
	@DataProvider(name="create")
	public Object[][] dataSet(Method m) {
		Object[][] testData=null;
		
		if(m.getName().equals("test")) {
			testData= new Object[][] {
				{"UseName1","Password1"},
				{"UseName2","Password2"}
			};
		}else if(m.getName().equals("test1")){
			testData = new Object[][] {
				{"User1","Pass1","Third"},
				{"User2","Pass2","Third1"},
				{"User3","Pass3","Third2"},
				{"User4","Pass4","Third3"}
			};
		}
			
		return testData;
	}
	
		
	@DataProvider
	public Object[][] dataSet1() {
				
		return new Object[][] {
			{"UseName1","Password1","Test1"},
			{"UseName2","Password2","Test2"},
		};
		
	}
}
