package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_dropdown_multiple_selection_state {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
	    driver.manage().window().maximize();
	    
	    
	    /*
	     * Example:-->
	     * 			Verifying State Dropdow is a single /multiple selection type..
	     */
	    
	    
	    
	   boolean flag=new Select(driver.findElement
			   (By.id("customState"))).isMultiple();
	   System.out.println("Dropdown multiple selection status is => "+flag);

	   
	   /*
	    * Usning javascript convert single option dropdown to multiple
	    * option dropdown..
	    */
	   ((JavascriptExecutor)driver).executeScript
	   ("document.getElementById('customState').setAttribute('multiple','multiple')");	   
	   Thread.sleep(3000);
	   
	   
	   
	  boolean flag1= new Select(driver.findElement(By.id("customState"))).isMultiple();
	  System.out.println("Dropdown multiple selection status is => "+flag1);
	   
	}

}
