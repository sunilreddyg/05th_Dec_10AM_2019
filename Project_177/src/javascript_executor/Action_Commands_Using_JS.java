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
		
	
		//select dropdown with value property using javascript 
		js.executeScript("document.getElementById('day').value='5'");
		//select dropdown with Index number  using javascript
		js.executeScript("document.getElementById('month').selectedIndex ='06'");
		
		
		//javascript selecting radio button
		WebElement Female_Rbtn=driver.findElement(By.xpath("//input[@value='1']"));
		js.executeScript("arguments[0].checked='true'", Female_Rbtn);
		Thread.sleep(3000);
		
		//javascript selecting radio button
		WebElement Male_Rbtn=driver.findElement(By.xpath("//input[@value='2']"));
		js.executeScript("arguments[0].click()", Male_Rbtn);
		
		//Perform click action using javascript on button..
		WebElement Signup_btn=driver.findElement(By.xpath("//button[@name='websubmit']"));
		js.executeScript("arguments[0].click()",Signup_btn);
		//This is final code for execution
	}

}
