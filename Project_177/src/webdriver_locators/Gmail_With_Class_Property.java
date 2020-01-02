package webdriver_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_With_Class_Property {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");
	    driver.manage().window().maximize();
	    
	    
	    /*
	     * => Before using class property make sure it is unique available
	     * 			with in htmlsource
	     * => Don't give class identify with spaces 
	     * => Make sure require object available at top position when
	     * 	  it was duplicate available..
	     */
	    
	    //Identify Email
	    driver.findElement(By.className("whsOnd")).clear();
	    driver.findElement(By.className("whsOnd")).sendKeys("qadarshan@gmail.com");
	    
	    
	    //Identify next button with class property..
	    driver.findElement(By.className("RveJvd")).click();
	    

	}

}
