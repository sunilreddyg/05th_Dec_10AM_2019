package robot_window_Interfaces;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Upload_Using_Keyboard_Shortcuts 
{

	public static void main(String[] args) throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");    
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://naukri.com");
		driver.manage().window().maximize();
		
		//Click Upload button
		WebElement Element=driver.findElement(By.xpath("//input[@id='input_resumeParser']"));
		new Actions(driver).click(Element).perform();
		
		
		String path="D:\\sunill\\Resume\\Sunil.docx";
		
		//Before Copy to clipboard Select a string
		StringSelection Spath=new StringSelection(path);
		//Get System default clipboard
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		//Set copied string content to clipboard
		clipboard.setContents(Spath, Spath);
		

		Robot robot=new Robot();
		robot.setAutoDelay(500);

		
		//Use Keyboard short Cntrl+V 
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(5000);
		
		//Press Enter key
		robot.keyPress(KeyEvent.VK_ENTER);
				
		//Release Control Key
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
				
		
		
		
		
		
		

	}

}
