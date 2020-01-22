package corejava.Variables.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WebElement_And_By_locator_References 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
	    driver.manage().window().maximize();
	    
	    //Webdriver scripting without using references.
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("9030248855");
	    
	   //Webdriver scripting with WebElement Reference
	   WebElement  password_EB=driver.findElement(By.id("pass"));
	   password_EB.clear();
	   password_EB.sendKeys("Hello12345");
	   
	   //Webdriver scripting using by locator and webelement reference.
	   By Login_btn_loc=By.xpath("//input[@value='Log In']");
	   driver.findElement(Login_btn_loc).click();
	   

	   
	}

}
