package corejava.Variables.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElement_Reference_Exception {

	public static void main(String[] args) {
		
		

		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
	    driver.manage().window().maximize();
	    
	    
	    //By locator reference
	    By Email_EB_loc=By.id("email");
	    driver.navigate().refresh();
	    driver.findElement(Email_EB_loc).clear();
	    driver.findElement(Email_EB_loc).sendKeys("9030248855");
	    
	    //Webdriver scripting with WebElement Reference
		 WebElement  password_EB=driver.findElement(By.id("pass"));
		 driver.navigate().refresh();
		 password_EB.clear();
		 password_EB.sendKeys("Hello12345");
		   
	    
		 driver.findElement(FB_SignIN.login_btn).click();

	}

}
