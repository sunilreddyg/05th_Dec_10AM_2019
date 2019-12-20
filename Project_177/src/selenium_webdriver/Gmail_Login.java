package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Login {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");
	    driver.manage().window().maximize();
	    
	    /*
	     * Type text into email editbox and press keyboard shorcut 
	     * Enter key to submit email
	     */
	    driver.findElement(By.id("identifierId")).clear();
	    driver.findElement(By.id("identifierId"))
	    .sendKeys("qadarshan"+Keys.ENTER);
	    
	    
	    
	    

	}

}
