package BOT;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class mobiledevices {
	
	
	private AppiumDriver driver;
	
	
	
	@BeforeTest
    public void InitConfig() throws MalformedURLException {
//		
//		File appDir = new File();
//		File app = new File(appDir, "")
//		
		
		
	DesiredCapabilities capabilites = new DesiredCapabilities();
	capabilites.setCapability("browserName", "Browser");
	capabilites.setCapability("device", "Android");
	capabilites.setCapability("deviceName", "emulator-5554");
	capabilites.setCapability("platformVersion", "9");
		capabilites.setCapability("platformName", "Android");
		capabilites.setCapability("appPackage", "com.android.chome");
		capabilites.setCapability("appActivity","com.google.android.apps.chrome.Main");	
		
		
		 driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilites);
		
	}
	
	@Test
	public void testApp() throws InterruptedException{
		
	driver.get("https://dev-01.skil.ai/ai-demo/html/pages/wu-assisstant.html");
		
		
		
	}

	
	
	
	
	
	
	
	
}
