package com.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class explicitywait {

	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\SELENIUM DRIVER\\geckodriver-v0.28.0-win64\\geckodriver.exe");


		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	
	}
	}
	


