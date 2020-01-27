package ui_verificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_EditBox_input_Value {

	public static void main(String[] args) throws Exception
	{
		
		/*
		 * 		Scenario:
		 * 				Verifying From city selection
		 * 				
		 * 				Given site url "http://cleartrip.com"
		 * 				When user type referral city name "HYD"at from editbox
		 * 				And select required city option
		 * 				Then selected city option should populate at From Editbox
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://cleartrip.com");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    
	    
	    WebElement From_EB=driver.findElement(By.xpath("//input[@id='FromTag']"));
	    From_EB.clear();
	    From_EB.sendKeys("HYD");
	    
	    Thread.sleep(5000); //Timeout to load sugesstions.
	    
	    WebElement CityOption=driver.findElement(By.xpath("//a[contains(.,'Hyderabad, IN - Rajiv Gandhi International (HYD)')]"));
	    CityOption.click();
	    
	    String Exp_value="Hyderabad, IN - Rajiv Gandhi International (HYD)";
	    
	    
	    //Get Editbox input value
	    String Act_value=From_EB.getAttribute("value");
	    
	    //Verify Expected and Actual value
	    if(Act_value.equals(Exp_value))
	    	System.out.println("Selected city populated at from editbox");
	    else
	    	System.out.println("Selected city not populated at from editbox");

	}

}
