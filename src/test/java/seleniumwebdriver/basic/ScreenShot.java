package seleniumwebdriver.basic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		//driver.get("https://is.rediff.com/signup/register");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination= new File("C:\\Users\\HP\\automation workplace\\seleniumwebdriver\\Screenshot\\Photo2.jpeg");
		FileHandler.copy(source, destination);

	}

}
