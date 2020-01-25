package ui_verificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verifying_Option_Available_At_Dropdown {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * 		Scenario:
		 * 				Verifying Cities displayed w.r.t state selection
		 * 				
		 * 				Given site url "http://hdfcbank.com"
		 * 				When user select any state dropdown
		 * 				Then should display respective cityname under city dropdown.
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://v1.hdfcbank.com/branch-atm-locator");
	    driver.manage().window().maximize();
	    
	    
	    Select State_dropdown=new Select(driver.findElement(By.id("customState"))); 
	    State_dropdown.selectByVisibleText("Telangana");
	    Thread.sleep(5000);
	    
	    
	    //Identify City dropdown
	    WebElement City_dropdown=driver.findElement(By.id("customCity"));
	    String All_Cities=City_dropdown.getText();
	    //System.out.println(All_Cities);
	    
	    
	    //verify in all cities expected city availability
	    if(All_Cities.contains("Hyderabad"))
	    	System.out.println("Expected city displayed on state selection");
	    else
	    	System.out.println("expected city not displayed on state selection");

	}

}
