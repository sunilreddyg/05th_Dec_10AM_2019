package interactions.Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Scenario:--> 
		 * 			Given url is "http://naukri.com
		 * 			When user hover on jobs at main menu
		 * 			Then it display list of sub menu items under main menu.
		 */
		
		
		//Example:--> A program to perform hover action on selected location
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("https://naukri.com");  //Load webpage
		driver.manage().window().maximize();  //maximize browser window
		Thread.sleep(5000);	
		
		
		
		
		
		/*
		 * To enable mouse and keyboard interaction on automation
		 * browser, We must create object for Actions class.
		 * Actions class contains set of mouse and keyboard interactions
		 */
		
		//Hover action on location..
		WebElement Jobs_menu=driver.findElement(By.xpath("//div[@class='mTxt'][contains(.,'Jobs')]"));
		new Actions(driver).moveToElement(Jobs_menu).perform();
		
		//Identify sub menu item 
		WebElement Register=driver.findElement(By.xpath("(//a[contains(@title,'Register Now')])[1]"));
		new Actions(driver).click(Register).pause(3000).perform();

	}

}
