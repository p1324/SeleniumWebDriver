package seleniumwebdriver.basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListOfQualifiedTeams {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.cricbuzz.com/cricket-series/7476/icc-mens-t20-world-cup-2024/points-table");
		List<WebElement> Qualifiedteams = driver.findElements(
				By.xpath("//table[@class='table cb-srs-pnts']//td//span[contains(text(),'Q')]//parent::div[text()='India']"));

		for (WebElement teams : Qualifiedteams) {
			System.out.println(teams.getText());
			
			  if (teams.getText().contains("India"))
			  {
				  teams.click();
				  }
			 
		}
	}

}
