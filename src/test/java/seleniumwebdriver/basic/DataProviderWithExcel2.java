package seleniumwebdriver.basic;


	import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

	public class DataProviderWithExcel2 {

	    @DataProvider(name = "loginData")
	    public Object[][] loginData() throws IOException {
	        // Specify the path to your Excel file
	        String excelFilePath = "C:\\Users\\HP\\automation workplace\\seleniumwebdriver\\TestData\\testDataforDataproviderwithExcel.xlsx";
	        
	        FileInputStream fis = new FileInputStream(excelFilePath);
	        Workbook workbook = new XSSFWorkbook(fis);
	        Sheet sheet = workbook.getSheetAt(0); // Assuming the data is in the first sheet
	        
	        int rowCount = sheet.getPhysicalNumberOfRows();
	        Object[][] data = new Object[rowCount][3]; 
	       // Object[][] data1 = new Object[rowCount-1][3]; // Assuming the first row is headers

	        for (int i = 0; i < rowCount; i++) {
	            Row row = sheet.getRow(i);
	            data[i][0] = row.getCell(0).getStringCellValue(); // Username
	            data[i][1] = row.getCell(1).getStringCellValue(); // Password
	          data[i][2] = row.getCell(2).getStringCellValue(); // email
	          //data[i-1][0] = row.getCell(0).getStringCellValue(); // when first row is header
	          //  data[i-1][1] = row.getCell(1).getStringCellValue(); // for loop will start
	          //data[i-1][2] = row.getCell(2).getStringCellValue(); // with i=1
	        }

	        workbook.close();
	        fis.close();
	        return data;
	    }

	    @Test(dataProvider = "loginData")
	    public void testLogin(String username, String password,String email) {
	      
	        System.out.println("Testing login with Username: " + username + " and Password: " + password+"and email "+email);
	        
	        

	    }
	}


