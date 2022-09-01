package test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class appium_basics {
	
@Test
	public static AndroidDriver<AndroidElement> test() throws MalformedURLException
	{
		//AndroidDriver
		//Flow: Appium code > Appium Server > Mobile
		//UiAutomator2Options options = new UiAutomator2Options(;)
		File dir= new File ("src\\test\\java\\resources");
		File app = new File(dir, "ApiDemos-debug.apk");
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Testemulator"); 
		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath() );
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723"),capabilities);
		return driver; //Apiium local IP address
	    
	}

}
