package seleniumwebdriver.basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		// by name
		// driver.findElement(By.name("search")).sendKeys("Mac");

		// by id
		// Boolean b=driver.findElement(By.id("logo")).isDisplayed();
		// System.out.println(b);

		// by lintext and partiallinktext
		// driver.findElement(By.linkText("Tablets")).click();
		// driver.findElement(By.partialLinkText("Tab")).click();
 
		// TagName
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (WebElement link : links) {
			System.out.println(link.getText());
		}

		//List<WebElement> images = driver.findElements(By.tagName("img"));
	//	System.out.println(images.size());

		driver.close();
	}

}
