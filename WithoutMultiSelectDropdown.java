package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WithoutMultiSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\BrowserDec24\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		Thread.sleep(2000);
		WebElement dd1 = driver.findElement(By.xpath("//select[@name='country']"));
		Thread.sleep(2000);
				
		if (dd1.isDisplayed() && dd1.isEnabled())
		{
			System.out.println("drop down is displayed and enabled");
		}
		else
		{
			System.out.println("either drop down is not displayed or not enabled or both");
		}
		
		
		Select sel = new Select(dd1);
		      if(sel.isMultiple())
		      {
		    	  System.out.println("drop down allows multiple selection");
		      }
		      else
		      {
		    	  System.out.println("drop down does not allow multiple selection");
		      }
	
		    int numberOfCountries =      sel.getOptions().size();
		 System.out.println("Total number of countries is : " + numberOfCountries);
		 
		 //argentia   india   USA  
		 
		 sel.selectByIndex(9);
		 
	String countryChosen1=	 sel.getFirstSelectedOption().getText();
	System.out.println("Country chosen was : " + countryChosen1);

	Thread.sleep(2000);
	 sel.selectByVisibleText("India");
	 
		String countryChosen2=	 sel.getFirstSelectedOption().getText();
		System.out.println("Country chosen was : " + countryChosen2);

		Thread.sleep(2000);

	sel.selectByValue("US");
	String countryChosen3=	 sel.getFirstSelectedOption().getText();
	System.out.println("Country chosen was : " + countryChosen3);

		
	}

}
