package data_provider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.utility.dataprovider.Testutility;

public class dataprovider{


		WebDriver driver;
		
		@BeforeMethod
	   
		public void setup() {
			
			System.setProperty("webdriver.gecko.driver", "F://selenium//SELENIUM DRIVER//geckodriver-v0.28.0-win64//geckodriver.exe");
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			
		    driver.get("https://signup.ebay.com/pa/crte");
	
		  }	
		
	@DataProvider
		public Iterator<Object[]> getTestdata() {
			
          ArrayList<Object[]> testdata =Testutility.getdatafromexcelfile();	
           return testdata.iterator();
		}
		
		@Test(dataProvider = "getTestdata")
		public void exceltest(String firstname,String LastName,String Emailaddress,String password) {
		
	        driver.findElement(By.xpath("//*[@id='firstname']")).clear();
            driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys(firstname);
            
            driver.findElement(By.xpath("//*[@id='lastname']")).clear();
            driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys(LastName);
            
            driver.findElement(By.xpath("//*[@id='Email']")).clear();
            driver.findElement(By.xpath("//*[@id='Email']")).sendKeys(Emailaddress);
            
            driver.findElement(By.xpath("//*[@id='password']")).clear();
            driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password);
			
		
			
		}
			
	      @AfterMethod
	
	      public void Teardown() {
		    driver.quit();
	
		
	      }
}
	



