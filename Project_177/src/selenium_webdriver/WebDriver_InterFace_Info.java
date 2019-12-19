package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_InterFace_Info {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
	    driver.manage().window().maximize();
	    
	    //Enter text into email editbox 
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("9030248855");
		
		//Enter text into password editbox
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys("newpwd12345");
		
		//click on Login button
		driver.findElement(By.id("u_0_b")).click();
		
	}

}
