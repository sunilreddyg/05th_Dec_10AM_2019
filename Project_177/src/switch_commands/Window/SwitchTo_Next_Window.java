package switch_commands.Window;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Next_Window {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
	    driver.manage().window().maximize();
	    
	    //Capture Current Window Dynamic ID
	    String MainwindowID=driver.getWindowHandle();
	    System.out.println(MainwindowID);
	    
	    //Click Hyperlink [It open page in new window]
	    WebElement Instagram_link=driver.findElement(By.linkText("Instagram"));
	    Instagram_link.click();
	    
	
	    
	    //Get all window ID's
	   Set<String> All_windowIDS= driver.getWindowHandles();
	   //Iterate for number of windows
	   for (String EachWindowID : All_windowIDS) 
	   {
		   //Accept codition when window id not match with Mainwindow id
		   	if(!EachWindowID.equals(MainwindowID))
		   	{	
		   		//apply switch to window
		   		driver.switchTo().window(EachWindowID);
		   		break;  //Break iteration and keep window control at sub window.
		   	}
	   }
	   
	   
	   Thread.sleep(5000);
	   System.out.println("Current Focused window title is => "+driver.getTitle());
	 
	   
	   WebElement Email_or_Mobile=driver.findElement(By.xpath("//input[contains(@name,'emailOrPhone')]"));
	   Email_or_Mobile.clear();
	   Email_or_Mobile.sendKeys("9030248855");
	   
	   WebElement Fullname=driver.findElement(By.xpath("//input[contains(@aria-label,'Full Name')]"));
	   Fullname.clear();
	   Fullname.sendKeys("Mindq");
	   
	   
	   
	   
	   
	   
	   
	   
	    
	    
	    
	}

}
