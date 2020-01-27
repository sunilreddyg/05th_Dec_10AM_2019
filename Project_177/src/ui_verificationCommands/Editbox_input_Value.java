package ui_verificationCommands;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Editbox_input_Value {

	public static void main(String[] args) 
	{
		/*
		 * 		Scenario:
		 * 				Verifying Departure date status
		 * 				
		 * 				Given site url "https://www.spicejet.com/"
		 * 				when user select trip type selection as oneway
		 * 				Then verify departue date matching with current system date.
		 */
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://spicejet.com");
	    driver.manage().window().maximize();
		
		
	    
	    //Identify Departue date editbox
	    WebElement Departure_Date=driver.findElement(By.id("ctl00_mainContent_view_date1"));
	    //Get Input presented at editbox
	    String D_date=Departure_Date.getAttribute("value");
	    System.out.println(D_date);
	    
	    
	    //Get Default system date
	    Date d=new Date();     //import java.util;
	    System.out.println(d.toString());
	    
	    //Create simple date formatter
	    SimpleDateFormat sdf=new SimpleDateFormat("dd/MM");
	    //Convert Defualt sytem date using simple date formatter
	    String S_Date=sdf.format(d);
		
		//Verify Equal comparision between Depareture date and Current system date
	    if(D_date.equals(S_Date))
	    	System.out.println("As expected departure displayed current date");
	    else
	    	System.out.println("Date mismatch, Current date not displayed");
		
	    /*
		 * Date formatters:-->
		 * 
		 * 		yyyy =>    year   [2019]
		 * 		  yy =>    year   [19]
		 * 		  MM =>    Month  [01-12]
		 * 		MMM  =>    Month  [Jan -Dec]
		 * 		EEE  =>    week   [sun -sat]
		 * 		  dd =>    date   [01-31]
		 * 		  hh =>    hour   [01-24]
		 * 		  mm =>    minute [01-60]
		 * 		  ss =>    Seconds[01-60]
		 * 		
		 */
	    
	    
	    /*
		 * 		Scenario:
		 * 				Verifying Departure date editbox status
		 * 				
		 * 				Given site url "https://www.spicejet.com/"
		 * 				Then verify Departure date editbox is readonly on browser launch
		 */
	    
	    /*
  		 * 		Scenario:
  		 * 				Verifying Departure date editbox status
  		 * 				
  		 * 				Given site url "https://www.spicejet.com/"
  		 * 				When user open Departure date calendar
  		 * 				And select any new date
  		 * 				Then verify selected date populated at Departure editbox.
  		 */
	    
	    
	    
	    
	    
	    
	  	    
	    
		

	}

}
