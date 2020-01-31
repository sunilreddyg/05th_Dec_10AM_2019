package interactions.Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_DropBy 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");    
		//browser initiation command
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.hdfcbank.com/personal/tools-and-calculators/personal-loan-calculator");
		driver.manage().window().maximize();
		
		
		WebElement Scroller=driver.findElement(By.xpath("//input[@ng-model='mainctrl.newCarSlider']"));
		
		//Performing drag and drop using coordinates.
		new Actions(driver).dragAndDropBy(Scroller, 50, 0).perform();
		
		

	}

}
