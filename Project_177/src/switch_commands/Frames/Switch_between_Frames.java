package switch_commands.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Switch_between_Frames {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://epass.apcfss.in/");
	    driver.manage().window().maximize();
	    
	    //Switch to frame using ID/name property
	    driver.switchTo().frame("menuFrame");
	    
	    WebElement Fee_Structure=driver.findElement(By.xpath("//a[@href='FeestructureReport.do']"));
	    Fee_Structure.click();
	    Thread.sleep(4000);
	    
	    //Get controls back to mainpage
	    driver.switchTo().defaultContent();
	    
	    //Apply switch to frame using Otherthan ID/name property
	    WebElement BodyFrame=driver.findElement(By.cssSelector("frame[title='bodyFrame']"));
	    driver.switchTo().frame(BodyFrame);
	    
	    //IDentify Element under bodyframe
	    WebElement University_DD=driver.findElement(By.xpath("//select[@id='univ']"));
	    new Select(University_DD).selectByIndex(3);
	    
	    //Switch Controls to mainpage
	    driver.switchTo().defaultContent();
	    
	    //Switch to frame using index number
	    driver.switchTo().frame(6);
	    
	    WebElement Login=driver.findElement(By.xpath("//a[contains(.,'Official Login')]"));
	    Login.click();
	    
	    //Get control back to mainpage
	    driver.switchTo().defaultContent();
	    
	    
	    
	    
	    

	}

}
