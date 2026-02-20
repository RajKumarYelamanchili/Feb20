package selenium_basics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\BrowserDec24\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://omayo.blogspot.com");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Open a popup window")).click();
		Thread.sleep(2000);
	String parentWindow=	driver.getWindowHandle();
	System.out.println("parent windown: " + parentWindow);
	System.out.println("*************");
	 Set<String>  allWindows = driver.getWindowHandles();
	 Thread.sleep(2000);
	 Iterator<String> itr = allWindows.iterator();
	         String p=        itr.next();
	         System.out.println("parent window1: " + p);
	         Thread.sleep(2000);
	  String childWindow=          itr.next();
	  System.out.println("child window: " + childWindow);
	  Thread.sleep(2000);
	  
	  driver.switchTo().window(childWindow);
	  Thread.sleep(2000);
	String txt1=  driver.findElement(By.xpath("//h3[text()='New Window']")).getText();
	System.out.println("the text in the child window is : " + txt1);
	
	Thread.sleep(2000);
	driver.close();
	  
	driver.switchTo().window(parentWindow);
	Thread.sleep(2000);
WebElement btn	= driver.findElement(By.xpath("//button[text()='Button2']"));
Thread.sleep(2000);
	
	String btnTxt  = btn.getText();
	Thread.sleep(2000);
	System.out.println("text of button : " + btnTxt);

		
	}

}
