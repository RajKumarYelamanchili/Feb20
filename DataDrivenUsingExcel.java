package selenium_basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenUsingExcel {

	public static void main(String[] args) throws IOException, InterruptedException {
		File scr = new File("D:\\FileHandling\\ReadExcel.xlsx");
		FileInputStream fis = new FileInputStream(scr);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		   XSSFSheet sheet1 =   wb.getSheetAt(0);
		   
		    int rowCount= sheet1.getLastRowNum();
		    
		    for(int i=0;i<=rowCount;i++)
		    {
		    	System.setProperty("webdriver.chrome.driver","D:\\BrowserDec24\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				Thread.sleep(2000);
				
				driver.manage().window().maximize();
				Thread.sleep(2000);
				driver.get("https://www.facebook.com");
				Thread.sleep(2000);
		    	   String username=    sheet1.getRow(i).getCell(0).getStringCellValue();
		    	  // System.out.println("Username is : " +  username);
		    	   driver.findElement(By.name("email")).sendKeys(username);
		    	   Thread.sleep(2000);
		    	   
		    	  String password= sheet1.getRow(i).getCell(1).getStringCellValue();
		    	  driver.findElement(By.name("pass")).sendKeys(password);
		    	//  System.out.println("Password is : " + password);
		    	  Thread.sleep(2000);
		    	  driver.close();
		    	
		    	
		    	
		    }

	}

}
