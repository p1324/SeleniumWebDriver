package seleniumwebdriver.basic;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLink {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://deadlinkcity.com/");
		// store all links in list
		List<WebElement> list = driver.findElements(By.tagName("a"));

		int brokenCount = 0;
		int workingCount = 0;
		// get links one by one by using getattribute --it will return attribute value.
		for (int i = 0; i < list.size(); i++) {
			WebElement e = list.get(i);
			String val = e.getAttribute("href");
			// System.out.println(val);

			// Create obj of url class
			URL url = new URL(val);
			// create huc obj
			HttpURLConnection huc = (HttpURLConnection) url.openConnection();
			huc.connect();
			int rcode = huc.getResponseCode();

			if (rcode > 400) {
				System.out.println(url + "----- this link is broken");
				brokenCount ++;
			} else {
				System.out.println(url + "---- url is working");
				workingCount ++;
			}

		}
		
		  System.out.println("==========================================");
		  System.out.println("total numbers of links on page : " + list.size());
		  System.out.println("number of broken links   " + brokenCount);
		  System.out.println("number of working links   " + workingCount);
		 
		driver.quit();
	}

}
