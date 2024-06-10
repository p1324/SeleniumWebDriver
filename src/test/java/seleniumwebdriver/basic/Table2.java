package seleniumwebdriver.basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		List<WebElement> rowList = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));

		List<WebElement> columnList = driver.findElements(By.xpath("//table[@name='BookTable']//tr/th"));
		System.out.println("no of columns"+columnList.size());

		for (int r = 2; r <= rowList.size(); r++) {
			for (int c = 1; c <= columnList.size(); c++) {
String val = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td["+c+"]")).getText();

// //table[@name='BookTable']//tr[3]/td[3]
System.out.print(val+"\t\t\t");
			}
			System.out.println();
		}

	}

}
