package corejava.Variables.Global;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Helper
{
	
	String filepath=null;
	WebDriver driver=null;
	String url=null;
	String username=null;
	String password=null;
	
	/*
	 * Methodname:--> launch browser
	 * 	Note:--> Before calling method Assign driver path  and Url
	 */
	public void Launch_Browser()
	{
		System.setProperty("webdriver.chrome.driver", filepath+"chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	
	/*
	 * Methodname:--> user signin
	 * 	Note:--> Before calling method Assign username and password
	 */
	public void SignIn()
	{
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password+Keys.ENTER);
	}
	

}
