package extent_reports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Create_Reports_At_ExtentTest {

	public static void main(String[] args) {
		
		String filepath="Reports\\Report1.html";
		//Create reporter file using html file format
		ExtentReports reporter=new ExtentReports(filepath, true);
		
		
			ExtentTest test1=reporter.startTest("Tc001_Verify_login");
					test1.log(LogStatus.INFO, "Facebook Page Launched");
					test1.log(LogStatus.INFO, "Email Enter successfull");
					test1.log(LogStatus.INFO, "password Enter successfull");
					test1.log(LogStatus.INFO, "Login button clicked");
					test1.log(LogStatus.PASS, "User Login Successfull");
			reporter.endTest(test1);
			
			ExtentTest test2=reporter.startTest("Tc002_Verify_Signup");
					test2.log(LogStatus.INFO, "Facebook Page Launched");
					test2.log(LogStatus.INFO, "Singup details entered");
					test2.log(LogStatus.FAIL, "Registration failed with valid details");
			reporter.endTest(test2);
			
		//Flush all runtime generated reports to html file..
		reporter.flush();

	}

}
