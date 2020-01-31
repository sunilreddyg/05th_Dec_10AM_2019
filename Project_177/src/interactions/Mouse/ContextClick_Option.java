package interactions.Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick_Option 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		
		WebElement Button_Location=driver.findElement(By.xpath("//span[.='right click me']"));
		//Perform right click on selected target
		new Actions(driver).contextClick(Button_Location).perform();
		
		//IDentify Option under context menu
		WebElement Delete=driver.findElement(By.xpath("/html/body/ul/li[5]/span"));
		//Perform click action using mouse interactions
		new Actions(driver).click(Delete).perform();
		
		
	}

}
