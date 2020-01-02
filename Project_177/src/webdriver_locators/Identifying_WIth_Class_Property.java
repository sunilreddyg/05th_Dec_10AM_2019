package webdriver_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Identifying_WIth_Class_Property {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
	    driver.manage().window().maximize();
	  
	    
	    driver.findElements(By.className
	    		("inputtext")).get(6).sendKeys("hello");
	  /*  
	   * 	Get is a method from list interface class it allows to get
	    	single object from collection of objects using Inded number
	   */
	    
	    
	}

}
