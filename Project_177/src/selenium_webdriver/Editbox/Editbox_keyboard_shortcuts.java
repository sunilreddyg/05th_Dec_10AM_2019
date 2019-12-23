package selenium_webdriver.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Editbox_keyboard_shortcuts {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
	    driver.manage().window().maximize();
	    
	    
	    driver.findElement(By.id("u_0_m"))
	    .sendKeys("Arjun"+Keys.TAB
	    		+"Krishna"+Keys.TAB
	    		+"ArjunKrishna@gmail.com"+Keys.TAB
	    		+"ArjunKrishna@gmail.com"+Keys.TAB
	    		+"Newpwd");
	    
	    //Select dropdown using keyboard shortcuts..
	    
	    driver.findElement(By.id("day")).sendKeys("25");
	    driver.findElement(By.id("month")).sendKeys("123");
	    
	    System.out.println("Dropdown is selected");
	    /*
	     * => Senkeys command perform keyboard shortcuts on selected element
	     * => For keywords shortcuts webdriver doesn't  throw any exception
	     * 		on it's failure...
	     */
	    
	}

}
