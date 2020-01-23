package ui_verificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifying_page_title {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.dev/");
	    driver.manage().window().maximize();
	    
	    String Exp_title="SeleniumHQ Browser Automation";
	    
	    //Method capture current window title at runtime.
	    String Act_title=driver.getTitle();
	    System.out.println("Current window title is => "+Act_title);
	
	    
	    //Decision to verify expected and actual title
	    if(Act_title.contains(Exp_title))
	    {
	    		System.out.println("Test Continued becuase expected title presented");
	    	
		    	WebElement download_btn=driver.findElement(By.xpath("(//b[contains(.,'DOWNLOAD')])[1]"));
		    	download_btn.click();
		    	
		    	if(driver.getTitle().equals("Downloads"))
		    	{
		    		System.out.println("Download page displayed");
		    	}
		    	else
		    	{
		    		System.out.println("Download page not displayed");
		    	}
	    }
	    else
	    {
	    	System.out.println("Test skipped because page title mismatch");
	    }
	    

	}

}
