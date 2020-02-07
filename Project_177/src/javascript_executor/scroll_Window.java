package javascript_executor;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class scroll_Window
{

	public static void main(String[] args) throws Exception 
	{
		//Set Runtime environment variable for chrome driver
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");    
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
	
		//To scroll window vertical.
	   ((JavascriptExecutor)driver).executeScript("window.scroll(100,600)");
	   Thread.sleep(4000);
	   
	   //To Scroll horizonal.
	   ((JavascriptExecutor)driver).executeScript("window.scroll(300,100)");
	    
	}

}
