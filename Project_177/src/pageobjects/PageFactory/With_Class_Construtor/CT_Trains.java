package pageobjects.PageFactory.With_Class_Construtor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CT_Trains 
{

	public CT_Trains(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}
	

	//@Findby lookup for object at webpage using pagefactory class.
	@FindBy(how=How.ID,using="from_station") 
	public WebElement From_AEB;
	
	@FindBy(xpath = "//li[contains(.,'Hyderabad Decan (HYB)')]")
	public WebElement From_HYD_City;
	
	@FindBy(xpath="//input[@name='to_station']")
	public WebElement To_AEB;
	
	@FindBy(xpath = "//li[contains(.,'Delhi (DLI)')]")
	public WebElement To_DIL_City;
	
	@FindBy(xpath = "//select[@id='trainClass']")
	public WebElement Travel_Class_DD;
	
	@FindBy(xpath = "//input[contains(@id,'dpt_date')]")
	public WebElement Date_DP;
	
	@FindBy(xpath = "//button[@id='trainFormButton']")
	public WebElement Search_train_BTN;
	
	
	/*
	 * Method:--> Search Train
	 */
	public void SearchTrain() throws Exception
	{
		From_AEB.clear();
		From_AEB.sendKeys("HYD");
		Thread.sleep(4000);
		From_HYD_City.click();
		
		To_AEB.clear();
		To_AEB.sendKeys("DEL");
		Thread.sleep(4000);
		To_DIL_City.click();
		
		new Select(Travel_Class_DD)
		.selectByVisibleText("AC 2 Tier (2A)");
		
		Date_DP.clear();
		Date_DP.sendKeys("24/1/2020");
		
		
	}

}
