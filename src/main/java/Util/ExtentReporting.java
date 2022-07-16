package Util;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReporting {
	 static ExtentReports report;
	static ExtentTest test;

	public static void main(String[] args) {
		report = new ExtentReports(System.getProperty("user.dir")+"ExtentReportResults.html");
		test = report.startTest("TestName");
		test.log(LogStatus.PASS,"test case passed");
		test.log(LogStatus.FAIL,"test case failed");
		report.endTest(test);
		report.flush();
		report.close();

	}

}
