package switch_commands.Window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchto_Window_Reusable_Method 
{
	static WebDriver driver;
	
	public static void switchto_window(String window_title)
	{
		//Get All Dynamic window ID's
		Set<String> allwindowIDS=driver.getWindowHandles();
		
		//Apply foreach to iterate number of windows
		for (String EachwindowID : allwindowIDS) 
		{
			 driver.switchTo().window(EachwindowID);
			 //Capture current window title
			 String Runtime_title=driver.getTitle();
			 //System.out.println(Runtime_title);
			 
			 if(Runtime_title.contains(window_title))
			 {
				 break;  //break iteration and keep foucus on required window
			 }
		}
	}
	
	
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://facebook.com");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    
	    //Capture Current Window Dynamic ID
	    String MainwindowID=driver.getWindowHandle();
	    System.out.println(MainwindowID);
	    
	    //Click Data policy link [It opens window]
	    driver.findElement(By.linkText("Data Policy")).click();
	    
	    //Switch to window
	    Thread.sleep(3000);
	    switchto_window("Data Policy");
	    System.out.println("Current window title is => "+driver.getTitle());
	    
	    //Click instagram setting link
	    driver.findElement(By.linkText("Instagram settings")).click();
	    
	    Thread.sleep(4000);
	    switchto_window("Instagram");
	    System.out.println("Current window title is => "+driver.getTitle());
	   
	    
	    

	}

}
