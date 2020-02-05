package switch_commands.ActiveElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_Switchto_ActiveElement {

	public static void main(String[] args) throws Exception
	{
		
		
		/*
		 * Syntax:-->
		 * 		driver.switchTo().ActiveElement();
		 * 	
		 * 		Method focus on activeElement at webpage and return
		 * 		WebElement referrals..
		 */
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://cleartrip.com");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);  //timeout to load Notificaton popup..
		
		//Identify Auto-Complete editbox and type referral keyword
	    driver.findElement(By.id("FromTag")).clear();
	    driver.findElement(By.id("FromTag")).sendKeys("HYD");
	    Thread.sleep(5000);
	    
	    driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN,Keys.ENTER);

	}

}
