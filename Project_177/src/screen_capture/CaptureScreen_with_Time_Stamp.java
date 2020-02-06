package screen_capture;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreen_with_Time_Stamp {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://naukri.com");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);  //timeout to load Notificaton popup..
	    
	    
	    //Get system date
	    Date d=new Date();
	    //Creating simple date format
	    SimpleDateFormat df=new SimpleDateFormat("yyyy/MMM/dd/ hh-mm-ss");
	    //Using simple date formatter convert system date
	    String time=df.format(d);

	    
	    //Capture screen and convert into file format
	   File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   FileUtils.copyFile(src, new File("screens\\"+time+"image.png"));

	}

}
