package seleniumwebdriver.basic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAutoUserInputFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");

		FileInputStream file = new FileInputStream(
				"C:\\Users\\HP\\automation workplace\\seleniumwebdriver\\TestData\\Book1.xlsx");
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		for (int i = 0; i <= sheet.getLastRowNum(); i++) {
			for (int j = 0; j < sheet.getRow(i).getLastCellNum(); j++) {

				String val = sheet.getRow(i).getCell(j).getStringCellValue();
				if (j == 0)
					driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(val);
				else
					driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(val);

			}

		}

	}

}
