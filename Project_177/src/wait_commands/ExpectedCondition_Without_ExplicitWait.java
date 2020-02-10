package wait_commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ExpectedCondition_Without_ExplicitWait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
	    driver.manage().window().maximize();
	    
	    String page_title="Facebook – log in or sign up";
	   boolean flag=ExpectedConditions.titleIs(page_title).apply(driver);
	   System.out.println("facebook title status is => "+flag);
	   
	   
	   String page_url="https://www.facebook.com/";
	   boolean flag1=ExpectedConditions.urlContains(page_url).apply(driver);
	   System.out.println("facebook url status is => "+flag1);
	    
	    
	    /*
	     * Note:--> Whenever expectedcondition implement without explicit
	     * 			we must add  apply(driver) condition at end of statement.
	     */
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

	}

}
