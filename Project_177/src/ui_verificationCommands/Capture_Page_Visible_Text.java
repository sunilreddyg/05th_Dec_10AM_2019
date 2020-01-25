package ui_verificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_Page_Visible_Text {

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
	    
	    
	    //identify page
	    WebElement Page=driver.findElement(By.tagName("body"));
	    //Capture entire visible text at webpage
	    String Visible_Text=Page.getText();
	    System.out.println(Visible_Text);
		
	    String Exp_msg="Sorry, but we can't continue until you fix everything that's marked in RED";
	    if(Visible_Text.contains(Exp_msg))
	    	System.out.println("text visible at webpage");
	    else
	    	System.out.println("text not visible at webpage");
	}

}
