package com.test;

import java.io.File;

import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshots {

	public static void main(String[] args) throws Exception {
	
		
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\SELENIUM DRIVER\\geckodriver-v0.28.0-win64\\geckodriver.exe");
		
		 
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
	    driver.get("http://www.google.com");
	    
	    Thread.sleep(2000);
	    
	    File scrShot =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(scrShot, new File("C:\\Users\\vikra\\eclipse-workspace\\ppp\\src\\shot.jpg"));
	    
	    
	    	    
	    
	    

	}

}
