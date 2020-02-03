package switch_commands.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchto_Frame_Using_Navigation_Command {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.cleartrip.com/account/trips?src=manageTrips");
	    driver.manage().window().maximize();
	    
	    //navigate to frame using frame URL
	    driver.navigate().to("https://www.cleartrip.com/signinstatic/tripidlogin.shtml?popup=no&guest=true");
	    
	    WebElement Email_EB=driver.findElement(By.xpath("//input[@name='email']"));
	    Email_EB.clear();
	    Email_EB.sendKeys("info.dsnr@gmail.com");
	    
	    //Back to homepage
	    driver.navigate().back();
	    
	    //Clicking link at mainpage...
	    WebElement Flights=driver.findElement(By.xpath("//span[contains(.,'Flights')]"));
	    Flights.click();
	    
	}

}
