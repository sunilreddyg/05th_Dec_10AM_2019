package interactions.Keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sendkeys_Keyboard_Shortcuts {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");    
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/jobs-internship");
		driver.manage().window().maximize();
		
		
		//Open Course list
		driver.findElement(By.xpath("//input[contains(@name,'course')]")).click();
		
		new Actions(driver).pause(2000)
		.sendKeys("MCA")
		.pause(2000)
		.sendKeys(Keys.TAB).perform();
		
		//Type HYD keyword at active location
		new Actions(driver).pause(3000)
		.sendKeys("HYD")
		.pause(3000)
		.sendKeys(Keys.ARROW_DOWN)
		.pause(3000)
		.sendKeys(Keys.ENTER).perform();		
		
		
		//Use tab key
		new Actions(driver)
		.sendKeys(Keys.TAB)
		.sendKeys("java")
		.pause(3000)
		.sendKeys(Keys.RETURN).perform();
		
		
		
	}

}
