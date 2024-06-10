package seleniumwebdriver.basic;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks2 {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.deadlinkcity.com/");
		Thread.sleep(2000);
		List<WebElement> links = driver.findElements(By.tagName("a"));
System.out.println(links.size());

		for (int i = 0; i < links.size(); i++)
		{
			WebElement e = links.get(i);
			String val = e.getAttribute("href");
			
			URL u= new URL(val);
			HttpURLConnection huc=(HttpURLConnection)u.openConnection();
			huc.connect();
			int rcode = huc.getResponseCode();
			
			if(rcode>400)
			{
				System.out.println(u+"---  broken");
			}
			else
			{
				System.out.println(u+"---  working");
			}
			
		}
driver.quit();
	}

}
