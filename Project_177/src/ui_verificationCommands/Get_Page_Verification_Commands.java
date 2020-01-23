package ui_verificationCommands;

import java.awt.Desktop.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Page_Verification_Commands {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.dev/");
	    driver.manage().window().maximize();
	    
	    //Method capture current window title at runtime.
	    String Act_title=driver.getTitle();
	    System.out.println("Current window title is => "+Act_title);
	
	    //Method capture current window url at runtime
	    String Act_url=driver.getCurrentUrl();
	    System.out.println("Current window url is => "+Act_url);
	    
	    //Method capture current window page source at runtime
	    String Act_Source=driver.getPageSource();
	    //System.out.println(Act_Source);
	    
	    //Method capture current window Dynamic ID
	    String WindowID=driver.getWindowHandle();
	    System.out.println(WindowID);
	    
	    
	    
	    
	    
	}

}
