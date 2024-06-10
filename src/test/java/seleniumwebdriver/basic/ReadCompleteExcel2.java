package seleniumwebdriver.basic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadCompleteExcel2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\HP\\automation workplace\\seleniumwebdriver\\TestData\\Book12.xlsx");
		Sheet sheet = WorkbookFactory.create(fis).getSheet("Sheet1");

		for (int i = 0; i <= sheet.getLastRowNum(); i++) {
			for (int j = 0; j < sheet.getRow(i).getLastCellNum(); j++) {
				System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() + " ");
			}
			System.out.println();
		}

	}

}
