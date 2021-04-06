package com.App.TestCases;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.App.Utilities.AppBrowserClass;
import com.App.Utilities.DataReaderClass;

import app.LoginPageObjects.Loginpage;



public class AppLoginTestCase {
	
	public static AppBrowserClass browser;
	public static WebDriver driver;
	public static DataReaderClass readdata;
	public static Loginpage loginpage;
	
@BeforeSuite
public void setupsuite() {
	browser=new AppBrowserClass();
	readdata=new DataReaderClass();
	
}


@BeforeTest
public void launchbrowser() {
	
	driver=AppBrowserClass.InvokeBrowser(readdata.getbrowsername(), readdata.getbrowserurl());
	
	
}
	
 
    @Test(priority=2,description="valid login test")
    public void verifyvalidlogin()
    {
    	
    	loginpage=new Loginpage(driver);
    	
    	loginpage.verifyusername();
    	loginpage.verifypassword();
    	loginpage.verifyloginbutton();
    	loginpage.verifysignout();
    	
    	
    }
    
    
    
    
    @Test(priority=1,description="Invalid login test")
    public void verifyinvalidlogin() {
    	
    	loginpage=new Loginpage(driver);
    	
    	loginpage.getinvalidusername();
    	
    	loginpage.verifypassword();
    	
    	loginpage.verifyloginbutton();
    	
    	try {
    		
    		loginpage.verifysignout();
    		
    		
    		
    	}catch(Exception e) {
    		System.out.println(e.getMessage());
    		System.out.println("Login fail");
    	}
    	
    	
    }
    
    
    @AfterTest
    public void closebrowser() {
    	
    	browser.closebrowser();
    	
    	
    }
    
    
    
    
}
