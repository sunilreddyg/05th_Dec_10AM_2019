package javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Action_Commands_Using_JS 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");    
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		
		//Enable Javascript on automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		//Type text into editbox
		js.executeScript("document.getElementById('email').value='9030248855'");
		js.executeScript("document.getElementById('pass').value='Hello123456'");
		
		//javascript using xpath or any locator otherthan ID
		WebElement Login_btn=driver.findElement(By.xpath("//input[contains(@value,'Log In')]"));
		js.executeScript("arguments[0].click()", Login_btn);
		
		
	}

}
