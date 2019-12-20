package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Registration 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
	    driver.manage().window().maximize();
	    
	    
	    //Clear command is only for editboxes..
	    driver.findElement(By.id("u_0_m")).clear();
	    driver.findElement(By.id("u_0_m")).sendKeys("Kiran");
		
	    driver.findElement(By.name("lastname")).clear();
	    driver.findElement(By.name("lastname")).sendKeys("krishna");
	   
	    /*
	     *	Note:-->
	     *		Sendkeys command send charactersequences and keyboard
	     *		shortcuts on selected webelement.
	     */
	    
	    
	    //Select dropdown using characters sequences..
	    driver.findElement(By.id("day")).sendKeys("25");

	    //Select dropdown opti0n using keyboard shrotcuts
	    driver.findElement(By.id("month"))
	    .sendKeys(Keys.ARROW_UP,Keys.ARROW_UP);
	}

}
