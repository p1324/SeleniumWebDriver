package seleniumwebdriver.basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scroll {

	
	@Test
	public void test() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		// scroll down 
		Thread.sleep(5000);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)"); 
		// scroll up
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-200)"); 
		// scroll to bottom of page
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)"); 
		// scroll to top
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(0,0)");
		
		char s='b';
		int a;
		a=Character.valueOf(s);
		System.out.println(a);
		
	}
	


}
