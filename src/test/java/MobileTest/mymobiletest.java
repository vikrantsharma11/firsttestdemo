package MobileTest;

import java.net.URL;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;

public class mymobiletest {
	
	static AppiumDriver<WebElement> driver;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			calculatortest();
			
			}catch (Exception exp){
			
				System.out.println(exp.getCause());
				System.out.println(exp.getMessage());
				exp.printStackTrace();
			}
			
		}
			public static void calculatortest() throws Exception  {
				
			
			DesiredCapabilities cap = new DesiredCapabilities();
		    
			cap.setCapability("deviceName", "Redmi");
			cap.setCapability("udid", "484f98a7ce40");
			cap.setCapability("platformName", "Android");
			cap.setCapability("platformVersion", "7.1.2");
			
			cap.setCapability("appPackage", "com.miui.calculator");
			cap.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");
			
			URL url = new URL("http:127.0.0.1:4723/wd/hub");
			
			driver = new AppiumDriver<WebElement>(url,cap);
		
		 
		
		System.out.println("application started...............");
		
		
	
	
		}
	}

