package robot_window_Interfaces;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.ImagingOpException;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Caputure_Screen_on_alert_presented 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/");
	    driver.manage().window().maximize();
		
		//Identify search button
	    WebElement Search_btn=driver.findElement(By.xpath("//input[@type='submit']"));
	    Search_btn.click();
	    Thread.sleep(5000);
	    
	    //get default screen size..
	    Dimension screen_size=Toolkit.getDefaultToolkit().getScreenSize();
	    
	    //Create object for Robot
	    Robot robot=new Robot();
	    BufferedImage image=robot.createScreenCapture(new Rectangle(screen_size));
	  
	    //Dump image into local utilities
	    String Output_imagepath="C:\\Users\\Administrator\\git\\05th_Dec_10AM_2019\\Project_177\\src\\switch_commands\\Alert\\image.png";
	    ImageIO.write(image, "PNG", new File(Output_imagepath));

	}

}
