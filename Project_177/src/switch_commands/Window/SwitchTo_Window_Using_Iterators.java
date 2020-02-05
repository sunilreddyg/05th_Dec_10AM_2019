package switch_commands.Window;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Window_Using_Iterators 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		//Capture current Window dynamic id
		String Main_windowID=driver.getWindowHandle();
		
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Check PNR Status']")).click();
		Thread.sleep(2000);
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Trains availability calendar']")).click();
		Thread.sleep(2000);
		
		
		//Get all dynamic window id's
		Set<String> allwindowIds=driver.getWindowHandles();
		//Conver all set of strings into iterations.
		Iterator<String> itr=allwindowIds.iterator();
		
		String Reservation_window=itr.next();
		driver.switchTo().window(Reservation_window);
		System.out.println(driver.getTitle());
		
		String Train_Availabilty_window=itr.next();
		driver.switchTo().window(Train_Availabilty_window);
		System.out.println(driver.getTitle());
		
		String Pnr_status_window=itr.next();
		driver.switchTo().window(Pnr_status_window);
		System.out.println(driver.getTitle());
		
		//Switch to window
		driver.switchTo().window(Train_Availabilty_window);
		System.out.println(driver.getTitle());
		

	}

}
