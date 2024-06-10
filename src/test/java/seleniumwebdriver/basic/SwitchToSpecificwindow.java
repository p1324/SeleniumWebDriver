package seleniumwebdriver.basic;

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
		
		driver.switchTo().window(childs.get(1));
		System.out.println(driver.getTitle());
		
		/*
		 * for(int i=0;i <childs.size();i++) { driver.switchTo().window(childs.get(i));
		 * }
		 */
		
		/*
		 * for(String c:childs) {
		 * 
		 * }
		 */
		
		
	}

}
