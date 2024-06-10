package seleniumwebdriver.basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookSignUP {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[text()='Create new account']")).click();
		//Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(50));
		WebElement name = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
				name.sendKeys("Monica");
		//driver.findElement(By.name("firstname")).sendKeys("Monica");
		// Thread.sleep(3000);
		driver.findElement(By.name("lastname")).sendKeys("Stark");
		// Thread.sleep(3000);
		WebDriverWait wait1= new WebDriverWait(driver,Duration.ofSeconds(50));
		WebElement email = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.name("reg_email__")));
				email.sendKeys("787878787878");
				
		//driver.findElement(By.name("reg_email__")).sendKeys("787878787878");
		// Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"password_step_input\"]")).sendKeys("9090909090");
		//Thread.sleep(3000);
	

		WebElement dayDropdown = driver.findElement(By.name("birthday_day"));
		Select s = new Select(dayDropdown);
		s.selectByIndex(0);
		//Thread.sleep(3000);

		WebElement monthDropdown = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		Select s1 = new Select(monthDropdown);
		s1.selectByVisibleText("Mar");

		WebElement yearDropdown= driver.findElement(By.id("year"));
		Select s2=new Select(yearDropdown);
		s2.selectByValue("1990");

		driver.findElement(By.xpath("//*[text()='Female']")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		//Thread.sleep(3000);

		// day=Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
		//// driver.quit();
	}


}
