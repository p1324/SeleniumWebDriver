package seleniumwebdriver.basic;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://demo.opencart.com/");
		Dimension d= new Dimension(700, 300);
		driver.manage().window().setSize(d);

		Point p =new Point(200, 200);
		driver.manage().window().setPosition(p);
	}

}
