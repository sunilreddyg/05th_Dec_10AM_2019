package pageobjects.PageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Run_CT_SearchFlight_Objects {

	public static void main(String[] args) throws Exception 
	{
		//Set Runtime environment variable for chrome driver
		String chrome_path="Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
				
		
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("http://cleartrip.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		/*
		 * Inorder to get @FindBy annotated object we should take help of
		 * pagefactory class.
		 */
		CT_Search_Flights Flights=PageFactory.initElements(driver, CT_Search_Flights.class);
		Flights.Roundtrip_Radio_btn.click();
		
		Flights.From_EB.clear();
		Flights.From_EB.sendKeys("H"+Keys.ARROW_RIGHT+"YD");
		Flights.Hyd_City_Airport.click();
		
		Flights.Arrival_EB.clear();
		Flights.Arrival_EB.sendKeys("D"+Keys.ARROW_RIGHT+"EL");
		Flights.Delhi_City_Airport.click();
		
		new Select(Flights.Adults_Dropdown).selectByVisibleText("5");

	}

}
