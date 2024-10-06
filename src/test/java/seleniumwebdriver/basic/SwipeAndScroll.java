package seleniumwebdriver.basic;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class SwipeAndScroll {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		//Gather Desired capabilities
		System.out.println("Hi1");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		  // capabilities.setCapability("deviceName","vivo V2204");
		  capabilities.setCapability("deviceName","Nokia 3110 android emulator");
	        capabilities.setCapability("platformname","Android");     
	        capabilities.setCapability("automationName","UiAutomator2");
	        capabilities.setCapability("platformversion","14");
	        
	        capabilities.setCapability("appPackage","com.google.android.calculator");
	        capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
	    	System.out.println("Hi2");
	        URL url = URI.create("http://127.0.0.1:4723").toURL();
	    	System.out.println("Hi3");
	        AndroidDriver driver = new AndroidDriver(url, capabilities);
	    	System.out.println("Hi4");
	        Thread.sleep(5000);
	        
	        System.out.println("Application Started");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        
	        WebElement num8 =  driver.findElement(By.id("com.google.android.calculator:id/digit_8"));
		       num8.click();
	        
	        
	}

}
