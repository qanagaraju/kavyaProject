package com.App.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.App.Utilities.AppBrowserClass;
import com.App.Utilities.DataReaderClass;

public class verifyWebLinks {
	
	public static WebDriver driver;
	public static DataReaderClass readdata;
	
	
	
	@BeforeTest
	public void launchbrowser() {
		
		driver=AppBrowserClass.InvokeBrowser(readdata.getbrowsername(), readdata.getbrowserurl());
		Reporter.log("Launching browser");
		
	}
	
	
  @Test
  public void f() {
	  
	  
	 
	  
  }
}
