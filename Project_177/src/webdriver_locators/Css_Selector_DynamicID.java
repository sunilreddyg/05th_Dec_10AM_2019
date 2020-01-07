package webdriver_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Selector_DynamicID {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	    driver.manage().window().maximize();
	    
	    
	    //Click Create account link
	   driver.findElement(By.cssSelector
			   ("a[href='//register.rediff.com/register/register.php?FormName=user_details']")).click();
	    
	    
	   //Identify firstname editbox
	   driver.findElement(By.cssSelector("input[name*='name']")).clear();
	   driver.findElement(By.cssSelector("input[name*='name']")).sendKeys("Arjn");
	   
	   //identify surname editbox
	   driver.findElement(By.cssSelector("input[name*='login']")).clear();
	   driver.findElement(By.cssSelector("input[name*='login']")).sendKeys("vijay");
	   
	   
	}

}
