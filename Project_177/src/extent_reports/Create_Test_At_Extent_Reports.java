package extent_reports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Create_Test_At_Extent_Reports {

	public static void main(String[] args) 
	{

		String filepath="Reports\\Report1.html";
		//Create reporter file using html file format
		ExtentReports reporter=new ExtentReports(filepath, true);
		
		
			ExtentTest test1=reporter.startTest("Tc001_Verify_login");
		
			reporter.endTest(test1);
			
			ExtentTest test2=reporter.startTest("Tc002_Verify_Signup");
			
			reporter.endTest(test2);
			
		//Flush all runtime generated reports to html file..
		reporter.flush();

	}

}
