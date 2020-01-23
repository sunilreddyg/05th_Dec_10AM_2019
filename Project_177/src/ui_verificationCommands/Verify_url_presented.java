package ui_verificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_url_presented {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.dev/");
	    driver.manage().window().maximize();
	    
	    
	    String Exp_url="https://selenium.dev/";
	    
	    //Get current runtime url
	    String Runtime_url=driver.getCurrentUrl();
	    
	    //Write a decision to verify expected and acutal url
	    if(Runtime_url.equals(Exp_url))
	    {
	    	System.out.println("Expected url presened for homepage");
	    	
	    	WebElement download_btn=driver.findElement(By.xpath("(//b[contains(.,'DOWNLOAD')])[1]"));
	    	download_btn.click();
	    	
	    	//Decision to verify url presented at webpage..
	    	if(driver.getCurrentUrl().contains("downloads"))
	    	{
	    		System.out.println("Download page displayed");
	    	}
	    	else
	    	{
	    		System.out.println("downlaod page not displayed");
	    	}
	    	
	    }
	    else
	    {
	    	System.out.println("wrong url presented");
	    }
	    
	    
	    
	    
	    

	}

}
