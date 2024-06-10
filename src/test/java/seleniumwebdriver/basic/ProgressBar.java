package seleniumwebdriver.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgressBar {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/progress-bar");

		// start
		driver.findElement(By.xpath("//button[@id='startStopButton']")).click();
		// compare is it 80%
		while (true) {
			String val = driver.findElement(By.xpath("//div[@role='progressbar']")).getAttribute("aria-valuenow");
			System.out.println(val);
			if (val.equalsIgnoreCase("80")) {
				// stop
				driver.findElement(By.xpath("//button[@id='startStopButton']")).click();
				break;
			}
		}
		driver.close();
	}

}
