package seleniumwebdriver.basic;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToSpecificwindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.xpath("//a[text()='SeleniumTutorial']")).click();

		Set<String> newWindow = driver.getWindowHandles();
		List<String> childs = new ArrayList<String>(newWindow);
		System.out.println(childs.size());

		/*
		 * driver.switchTo().window(childs.get(1));
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 * System.out.println(driver.getTitle());
		 */
		
		
		for (int i = 0; i < childs.size(); i++) {
			driver.switchTo().window(childs.get(i));
			if (i==1)
			{
			System.out.println(driver.getTitle());
			}
		}

		/*
		 * for(String c:childs) {
		 * 
		 * }
		 */

	}

}
