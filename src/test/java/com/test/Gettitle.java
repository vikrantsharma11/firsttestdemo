package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gettitle {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\SELENIUM DRIVER\\geckodriver-v0.28.0-win64\\geckodriver.exe");
		
		 
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
	    driver.get("http://www.google.com");
	    
	    String title = driver.getTitle();
	    
	    System.out.println(title);
	}

}
