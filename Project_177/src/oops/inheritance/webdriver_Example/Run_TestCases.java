package oops.inheritance.webdriver_Example;

import org.testng.annotations.Test;

public class Run_TestCases extends TestCases
{

	@Test
	public void Verify_FlighSearch()
	{
		Tc001_Setup_browser();
		Tc002_FlightSearch();
		driver.close();
	}
}
