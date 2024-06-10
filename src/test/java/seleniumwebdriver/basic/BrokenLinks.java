package seleniumwebdriver.basic;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver= new ChromeDriver();
		driver.get("http://deadlinkcity.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int brokenCount=0;
		int workingCount=0;
		for(int i=0;i<links.size();i++)
		{
			WebElement e = links.get(i);
			String val = e.getAttribute("href");
			
			URL u= new URL(val);
			try {
				HttpURLConnection huc= (HttpURLConnection)u.openConnection();
				huc.connect();
				int rcode = huc.getResponseCode();
				if(rcode>400)
				{
					System.out.println(u+"-----this is broken link");
					brokenCount++;
				}
				else
				{
					System.out.println(u+"-----this is working link");
					workingCount++;
				}
			} catch (IOException e1) {
				
				e1.printStackTrace();
			}
			
		}
		System.out.println("number of broken links "+brokenCount);
		System.out.println("number of working links "+workingCount);
	}

}
