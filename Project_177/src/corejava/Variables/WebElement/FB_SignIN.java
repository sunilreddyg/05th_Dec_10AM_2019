package corejava.Variables.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_SignIN

{
	//global variables..
	public static By Email_EB=By.id("email");
	public static By password_EB=By.id("password");
	public static By login_btn=By.xpath("//input[@value='Log In']");
	
	/*
	 * public :--> Access Modifier allow varaible to access
	 * 				across project
	 * static :--> Access Specifier allow variable to access
	 * 				without objet creation.
	 * 
	 */
	
	
	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
	    driver.manage().window().maximize();
	    
	    
	    driver.findElement(Email_EB).clear();
	    driver.findElement(Email_EB).sendKeys("9030248855");

	    driver.findElement(password_EB).clear();
	    driver.findElement(password_EB).sendKeys("Hello");
	    
	    driver.findElement(login_btn).click();
	   
	}

}
