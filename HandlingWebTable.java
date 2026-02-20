package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTable {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\BrowserDec24\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(2000);
		
		String beforeXpath="//table[@id='customers']/tbody/tr[";
		String afterXpath="]/td[1]";
		
		for(int i=2;i<=7;i++)
		{
            String actualXpath = beforeXpath + i + afterXpath;
        WebElement ele=       driver.findElement(By.xpath(actualXpath));
        System.out.println(ele.getText());
        Thread.sleep(1000);
        
		}
		
		//table[@id='customers']/tbody/tr[         for i  2 to  7         ]/td[1]

	}

}
