package com.test;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;



public class Handledropdown {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\SELENIUM DRIVER\\geckodriver-v0.28.0-win64\\geckodriver.exe");


		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://www.amazon.in");

		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("")));


		for (String handle:driver.getWindowHandles() ) {

			driver.switchTo().window(handle);

			driver.getTitle();
			
		}

			
		   }
	}
	
	
}
