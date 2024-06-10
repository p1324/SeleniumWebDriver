package seleniumwebdriver.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Pradip@123");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("531265");
		driver.findElement(By.xpath("//*[text()='Log in']")).click();

	}

}
