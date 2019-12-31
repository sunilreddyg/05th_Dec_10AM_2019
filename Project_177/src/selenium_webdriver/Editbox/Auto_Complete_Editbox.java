package selenium_webdriver.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Auto_Complete_Editbox 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://cleartrip.com");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);  //timeout to load Notificaton popup..
	    
	    //Select roundtrip radio button
	    driver.findElement(By.id("RoundTrip")).click();
	    
	    
	    //Identify Auto-Complete editbox and type referral keyword
	    driver.findElement(By.id("FromTag")).clear();
	    driver.findElement(By.id("FromTag")).sendKeys("HYD");
	    Thread.sleep(5000); //static timegap to load cities
	    driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();
	    
	    //Identify Auto-Complete editbox and type referral keyword
	    driver.findElement(By.id("ToTag")).clear();
	    driver.findElement(By.id("ToTag")).sendKeys("DEL");
	    Thread.sleep(5000); //static timegap to load cities
	    driver.findElement(By.linkText("New Delhi, IN - Indira Gandhi Airport (DEL)")).click();
	    
	    //selecting current active month date..
	    driver.findElement(By.linkText("22")).click();
	    Thread.sleep(5000);  //static Timegap
	    
	    //Here Return date editbox is writable so we can type date insted of selecting form datepicker
	    driver.findElement(By.id("ReturnDate")).clear();
	    driver.findElement(By.id("ReturnDate")).sendKeys("Sat, 25 Apr, 2020");

	    
	    //Select Number of Adults
	    new Select(driver.findElement(By.id("Adults")))
	    .selectByVisibleText("5");
	    
	    //Click Search flights button
	    driver.findElement(By.id("SearchBtn")).click();
	    
	    
	    
	    
	}

}
