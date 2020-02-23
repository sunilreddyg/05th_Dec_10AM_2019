package pageobjects.PageFactory.With_Global_Constructor;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run_Hotels {

	public static void main(String[] args) throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");    
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		CT_Hotels hotel=new CT_Hotels(driver);
		hotel.Verify_Hotels_page_Header();
		hotel.Where_locality_EB.clear();
		hotel.Where_locality_EB.sendKeys("HYD");
	
		
		Thread.sleep(5000);
		driver.close();
		

	}

}
