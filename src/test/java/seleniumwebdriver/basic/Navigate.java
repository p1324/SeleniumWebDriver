package seleniumwebdriver.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://demo.opencart.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
