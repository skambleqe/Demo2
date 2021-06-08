package raedWriteFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWriteDemo {

	public static void main(String[] args) throws IOException {
		Properties properties = new Properties();
       FileInputStream inutStream = new FileInputStream("D:\\Eclipse_Workspace\\raedWriteFile\\src\\test\\resources\\properties\\testData.properties");
       properties.load(inutStream);
       System.out.println(properties.getProperty("browser"));
       System.out.println(properties.getProperty("url"));
       FileOutputStream ouputStream = new FileOutputStream("D:\\Eclipse_Workspace\\raedWriteFile\\src\\test\\resources\\properties\\testData.properties");
       properties.setProperty("testData", "56564747");
       properties.store(ouputStream, "This is Comment");
       
	}

}
