package seleniumwebdriver.basic;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new EdgeDriver();
		driver.get("https://demo.opencart.com/");
		Thread.sleep(10000);
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		if (actualTitle.equals("Your Store"))

		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}
		driver.close();
	}

}
