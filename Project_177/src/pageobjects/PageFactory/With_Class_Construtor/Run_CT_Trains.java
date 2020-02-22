package pageobjects.PageFactory.With_Class_Construtor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run_CT_Trains {

	public static void main(String[] args) throws Exception {
		//Set Runtime environment variable for chrome driver
		String chrome_path="Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
				
		
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Create object for Class
		CT_Trains trains=new CT_Trains(driver);
		trains.SearchTrain();
		trains.Search_train_BTN.click();
		

	}

}
