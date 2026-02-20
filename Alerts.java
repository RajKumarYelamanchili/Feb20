package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\BrowserDec24\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://the-internet.herokuapp.com/");
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//a[text()='JavaScript Alerts']")).click();
		Thread.sleep(2000);
		
		//1st button
		
		  driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		  Thread.sleep(2000); 
		  driver.switchTo().alert().accept();
		 
		
		//2nd button
		
		  driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
			  Thread.sleep(2000); 
		  driver.switchTo().alert().dismiss();
		 
		
		//3rd button
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		driver.switchTo().alert().sendKeys("hello");
		driver.switchTo().alert().accept();
		

	
	}

}
