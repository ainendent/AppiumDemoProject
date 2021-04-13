package tests;

//import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CalculatorTest {
	
	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) {
		
		try {
			openCalculator();
		}catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}

	}
	
	public static void openCalculator() throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "vivo 1807");
		cap.setCapability("platformName", "android");
		cap.setCapability("platformVersion", "8.1.0");
		cap.setCapability("udid", "4bd74860");
		cap.setCapability("appPackage", "com.android.bbkcalculator");
		cap.setCapability("appActivity", "com.android.bbkcalculator.Calculator");
		cap.setCapability("automationName", "UiAutomator1");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new AppiumDriver<MobileElement>(url, cap);
		
		System.out.println("Application started..");
		
		MobileElement seven = driver.findElementById("com.android.bbkcalculator:id/digit7");
		MobileElement plus = driver.findElementById("com.android.bbkcalculator:id/plus");
		MobileElement eight = driver.findElementById("com.android.bbkcalculator:id/digit8");
		MobileElement equal = driver.findElementById("com.android.bbkcalculator:id/equal");
		MobileElement result = driver.findElementByClassName("android.widget.EditText");
		
		seven.click();
		plus.click();
		eight.click();
		equal.click();
		
		String res = result.getText();
		System.out.println("Result is : "+res);
		System.out.println("Completed!");
	}
}
