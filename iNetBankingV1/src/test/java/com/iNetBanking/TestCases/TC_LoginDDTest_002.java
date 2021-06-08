package com.iNetBanking.TestCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.iNetBanking.Base.BaseClass;
import com.iNetBanking.utilities.XLUtils;

public class TC_LoginDDTest_002 extends BaseClass{

	@Test
	public void loginDT() {
		
	}
	
	@DataProvider(name="LoginData")
	public void getData() throws IOException {
		String path="";
		int rowNum = XLUtils.getRowCount(path, "Sheet1");
		int colsCount = XLUtils.getColsCount(path, "Sheet1", 1);
		for(int i=1;i<rowNum;i++) {
			for(int j=0;j<colsCount;j++) {
				//testData[i-1][j] =
			}
		}
	}
}
