package browser_navigation_Commands;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Window {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		
		//maximize window
		driver.manage().window().maximize();
		
		//Set window size suing Height and width
		Dimension obj_dim=new Dimension(300, 200);
		driver.manage().window().setSize(obj_dim);
		
		//syntax return current window dimension [Height and width]
		Dimension New_Dim=driver.manage().window().getSize();
		System.out.println(New_Dim);
		
		//Set window position using x and y coordinates
		Point Obj_point=new Point(400, 100);
		driver.manage().window().setPosition(Obj_point);

		//Syntax to return Current window position
		Point Win_position=driver.manage().window().getPosition();
		System.out.println(Win_position);
		
		
		//syntax get fullscreen of browser window
		driver.manage().window().fullscreen();
	}

}
