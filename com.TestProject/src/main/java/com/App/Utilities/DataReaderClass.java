package com.App.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class DataReaderClass {
	
	
	public static Properties prop;
	
	
	public DataReaderClass() {
		
		try {
			
			File file = new File("./app.Project.Files/login.properties");
			FileInputStream fis = new FileInputStream(file);
			
			prop = new Properties();
			prop.load(fis);
			
			
			
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		
		
	}
	
	
	public String getbrowsername() {
		
		return prop.getProperty("browsername");
		
	}
	
	public String getbrowserurl() {
		return prop.getProperty("browserurl");
	}
	
	
	
	
	
	

}
