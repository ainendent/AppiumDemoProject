package tests;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidDriver;;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	
	//private WebDriver driver;
	
	//private static AppiumDriver driver ;
	AppiumDriver<MobileElement> driver;
	
	@BeforeTest
	public void setup(){
		
		try { 
			
		DesiredCapabilities caps = new DesiredCapabilities();
		
		//caps.setCapability("platformName", "ANDROID");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "VIVO 1807");
		caps.setCapability(MobileCapabilityType.UDID, "4bd74860");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		//caps.setCapability(MobileCapabilityType.APP, "/AppiumDemoProject/src/test/resources/apps/app-debug.apk");
		//caps.setCapability("appPackage",  "com.mitrais.recipedia");
		//caps.setCapability("appActivity",  "com.mitrais.recipedia.ui.MainActivity");
		
		//caps.setCapability("deviceName", "VIVO 1807");
		//caps.setCapability("udid","4bd74860");
		//caps.setCapability("platformName","Android");
		//caps.setCapability("platformVersion","7.1.2");
		//caps.setCapability("app","/AppiumDemoProject/src/test/resources/apps/app-debug.apk");
		
		URL url = new URL("https://127.0.0.1:4723/wd/hub");
		
		//driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		
		driver = new AppiumDriver<MobileElement>(url, caps);
		driver = new AndroidDriver<MobileElement>(url, caps);
		
		}catch(Exception exp) {
			System.out.println("Cause is : "+exp.getCause());
			System.out.println("Message is : "+exp.getMessage());
			exp.printStackTrace();
			}
		}
	
	@Test
	public void sampleTest() {
		System.out.println("Im inside sample Test");
	}
	
	@AfterTest
	public void teardown() throws Exception {
		driver.close();
		driver.quit();
		
	}

}
