package wait_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Attribute_Property {

	public static void main(String[] args) {
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("https://www.gmail.com/");       //Load webpage
		driver.manage().window().maximize();  //maximize browser window

		By email_editbox=By.xpath("//input[@name='identifier']");
		new WebDriverWait(driver, 100).until(ExpectedConditions.attributeToBe
				(email_editbox, "readonly", "readonly"));
		System.out.println("Editbox box is readonly");
		
		
		

	}

}
