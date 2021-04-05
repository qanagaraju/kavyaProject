package com.App.TestCases;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.App.Utilities.AppBrowserClass;
import com.App.Utilities.DataReaderClass;



public class AppLoginTestCase {
	
	public static AppBrowserClass browser;
	public static WebDriver driver;
	public static DataReaderClass readdata;
	
@BeforeSuite
public void setupsuite() {
	browser=new AppBrowserClass();
	readdata=new DataReaderClass();
}


@BeforeTest
public void launchbrowser() {
	
	driver = browser.InvokeBrowser(readdata.getbrowsername(), readdata.getbrowserurl());
	
	
}
	
 
    @Test
    public void verifyMaven()
    {
    	
    	
    	
    }
    
    
    
    @AfterTest
    public void closebrowser() {
    	
    }
    
    
    
    
}
