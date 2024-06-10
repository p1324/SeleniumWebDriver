package seleniumwebdriver.basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediff {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://is.rediff.com/signup/register");
		driver.manage().window().maximize();

		Thread.sleep(3000);

		// WebElement dateDay = driver.findElement(By.xpath("//*[@name="date_day"]"));
		// driver.findElement(By.xpath("//*[@name="date_day"]"))
		WebElement dateDay = driver.findElement(By.name("date_day"));
		Select s = new Select(dateDay);
		List<WebElement> opt = s.getOptions();
		for (WebElement element : opt) {
			System.out.println(element.getText());
		}

		Thread.sleep(3000);
		s.selectByIndex(1);

	}

}
//*[@id="date_day"]
//*[@name="date_day"]