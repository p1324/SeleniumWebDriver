package seleniumwebdriver.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InnerIFrame {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
		WebElement outerIframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerIframe);
		WebElement innerIframe = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(innerIframe);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello");
		
	}
	//div[@class='container iframes-page-container']
	//This element is in iframe - //div[@class='row']
	//*[@id="Multiple"]/iframe
	//iframe[@src='MultipleFrames.html']
	//div[@class='container iframes-page-container']
	//h5[normalize-space()='Nested iFrames']

}
