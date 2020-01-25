package ui_verificationCommands;

import javax.xml.transform.ErrorListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText_On_Location {

	public static void main(String[] args) throws Exception 
	{
		
		
		/*
		 * Feature:
		 * 			Verifying flight search 
		 * 
		 * 		Scenario:
		 * 				Searching flight without enter proper data
		 * 				
		 * 				Given site url "http://cleartrip.com"
		 * 				When user leave From and To input fields
		 * 				And click on flight search button
		 * 				Then receive Error message "Sorry, but we can't"
		 */
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://cleartrip.com");
	    driver.manage().window().maximize();
	    
		
	    WebElement FlightSearch_btn=driver.findElement(By.id("SearchBtn"));
	    FlightSearch_btn.click();
	    Thread.sleep(5000);
		
		
		//Identify error locatino
	    WebElement Error_location=driver.findElement(By.id("homeErrorMessage"));
	    //Capture Visble error message
	    String Act_Error_msg=Error_location.getText();
	    System.out.println(Act_Error_msg);
		
		
		String Exp_errmsg="Sorry, but we can't continue until you fix everything that's marked in RED";

		
		//decision to verify expected and actual value
		if(Act_Error_msg.equals(Exp_errmsg))
			System.out.println("As expected error message displayed");
		else
			System.out.println("Expected error message not displayed");
	}

}
