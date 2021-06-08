package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class DemoPropertiesFile {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileInputStream inputStream= new FileInputStream("D:\\Eclipse_Workspace\\ReadWriteData\\src\\test\\resources\\properties\\readWriteNewData.properties");
		prop.load(inputStream);
		System.out.println(prop.getProperty("Account"));
		System.out.println(prop.getProperty("ID"));
		FileOutputStream outputStream= new FileOutputStream("D:\\Eclipse_Workspace\\ReadWriteData\\src\\test\\resources\\properties\\readWriteNewData.properties");
		prop.setProperty("firstName", "Ajay");
		prop.store(outputStream, "kc n");

	}

}
