package extent_reports;

import com.relevantcodes.extentreports.ExtentReports;

public class Create_Extent_Reports {

	public static void main(String[] args) 
	{
		
		String filepath="Reports\\Report.html";
		//Create reporter file using html file format
		ExtentReports reporter=new ExtentReports(filepath, true);
		
		//Flush all runtime generated reports to html file..
		reporter.flush();

	}

}
