package screen_capture;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TakeScreen_At_Location {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * 	Note:-->To use fileutils[local folders and files] in selenium 
		 * 			3.6 above version ,below downloads required.  
		 * 
		 * URL:--> https://commons.apache.org/proper/commons-io/download_io.cgi
		 * 		   Download binrary file  --> commons-io-2.6-bin.zip
		 * 		   Unzip file and configure all executable jar files to selenium-project.
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  			  
		driver.get("https://www.firstnaukri.com/");       
		driver.manage().window().maximize();    
		
		//Target Location
		WebElement Location=driver.findElement(By.xpath("//a[@href='https://www.firstnaukri.com/job-listings-Relationship-Manager-Senior-Relationship-Manager-PAN-India-jobs-in-Mumbai-in-Future-Generali-India-Life-Insurance-Co-Ltd-250919600004?f=250919600004&othersrcp=HMJDtop'][contains(.,'Relationship Manager / Senior Relationship Manager - PAN India')]"));
		new Actions(driver).moveToElement(Location).perform();
		Thread.sleep(4000);
		
		//Capture screen and convert into file format
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//dump file into local utilities
		FileUtils.copyFile(src, new File("screens\\Targetimage1.png"));
		
		
		

	}

}
