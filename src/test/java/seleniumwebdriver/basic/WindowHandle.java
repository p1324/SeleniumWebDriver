package seleniumwebdriver.basic;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.xpath("//a[text()='SeleniumTutorial']")).click();

		Set<String> newWindow = driver.getWindowHandles();
		Iterator<String> itr = newWindow.iterator();
		while (itr.hasNext())

		{
			String s = itr.next();
			driver.switchTo().window(s);
			System.out.println(driver.getTitle()); //switching to all windows and getting title
			
		}
		/*
		 * String firstWindow = driver.getWindowHandle();
		 * driver.switchTo().window(firstWindow); System.out.println(driver.getTitle());
		 */
		
		

	}

}
