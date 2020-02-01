package switch_commands.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchto_Frame {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.cleartrip.com/account/trips?src=manageTrips");
	    driver.manage().window().maximize();
	    
	    
	    //Apply switch to frame using frame id
	    driver.switchTo().frame("modal_window");
	    
	    WebElement Email_EB=driver.findElement(By.xpath("//input[@name='email']"));
	    Email_EB.clear();
	    Email_EB.sendKeys("info.dsnr@gmail.com");
	    
	    //Get Controls from frame to webpage
	    driver.switchTo().defaultContent();
	    
	    WebElement Flights=driver.findElement(By.xpath("//span[contains(.,'Flights')]"));
	    Flights.click();

	}

}
