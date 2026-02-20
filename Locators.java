package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\BrowserDec24\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		  driver.findElement(By.name("email")).sendKeys("Sadhguru");
		  driver.findElement(By.name("email")).sendKeys("sourav ganguly");//name
		  Thread.sleep(2000);
		 driver.findElement(By.name("pass")).sendKeys("Dreams@123");
		 driver.findElement(By.id("email")).sendKeys("Prabhas");//id
		  driver.findElement(By.linkText("Create a Page")).click();//linktext 
		  driver.findElement(By.partialLinkText("eate a Pa")).click();//partial linktext
		  
		  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Dhoni");
		  //xpath //
		  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("suresh raina");
		 
		  driver.findElement(By.cssSelector("input#email")).sendKeys("Rohit Sharma");
		 
		
	}

}
