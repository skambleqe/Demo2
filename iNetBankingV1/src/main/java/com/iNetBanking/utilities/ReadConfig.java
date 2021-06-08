package com.iNetBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	Properties prop;
	public ReadConfig() {
		File fs= new File("./ConfigurationFiles/config.properties");
		try {
			FileInputStream fi = new FileInputStream(fs);
			prop = new Properties();
			try {
				prop.load(fi);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			    e.printStackTrace();
		}
		
	}
	
	public String getUrl() {
		return(prop.getProperty("BaseUrl"));
	}
	public String getUserName() {
		return(prop.getProperty("username"));
	}
	public String getPassword() {
		return(prop.getProperty("password"));
	}
	public String getDriverPath() {
		return(prop.getProperty("DRIVER_PATH"));
	}
}
