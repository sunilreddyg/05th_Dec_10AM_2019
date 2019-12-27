package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Selection_Commands {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
	    driver.manage().window().maximize();
	    
	    
	    
	  new Select(driver.findElement(By.id("customState")))
	  .selectByVisibleText("Telangana");
	  
	  Thread.sleep(5000);  //Timeout to load cities
	    
	  new Select(driver.findElement(By.id("customCity")))
	  .selectByVisibleText("Hyderabad");
	  Thread.sleep(5000);  //Static timeout
	    
	   //Selecting dropdown using click command
	  driver.findElement(By.cssSelector("#customCity > option:nth-child(6)"))
	  .click();
	  
	 
	  //Type text into editbox
	  driver.findElement(By.id("customLocality")).clear();
	  driver.findElement(By.id("customLocality")).sendKeys("Gandhi nagar");
	    
	    
	  
	  //Select dropdown using index number
	  new Select(driver.findElement(By.id("customRadius")))
	  .selectByIndex(3);
	    
	  //Selecting checkbox
	  driver.findElement(By.id("amenity_category_order_types50")).click();
	    
	  
	  //click Search button
	  driver.findElement(By.cssSelector("#SearchCustomAddress > ul > li:nth-child(7) > input[type=submit]")).click();

	}

}
