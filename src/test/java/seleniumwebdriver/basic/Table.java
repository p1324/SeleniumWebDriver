package seleniumwebdriver.basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		List<WebElement> allData = driver.findElements(By.xpath("//table[@name='BookTable']//td"));
		
		for(WebElement ele:allData)
		{
		String val=	ele.getText();
		System.out.println(val);
		//val.isEmpty();
		System.out.println();
		}
		
		//driver.quit();
	}

}
