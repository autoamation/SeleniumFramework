package TestNG;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import TestBase.Base;
import pageObjects.LoginPage;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LoginTest extends Base {
	LoginPage lp;
	static ExtentReports report;
	static ExtentTest test;
	
 @BeforeMethod
 public void beforeMethod() throws Exception {
	 report = new ExtentReports(System.getProperty("user.dir")+"/ExtentReportResults.html");
	test = report.startTest("TestName");
	Logger log = Logger.getLogger(LoginTest.class);
	LaunchBrowser();
	test.log(LogStatus.PASS, test.addScreenCapture(captureScreenshot("Launch browser")));
	lp = new LoginPage(driver);
	report = new ExtentReports(System.getProperty("user.dir")+"/ExtentReportResults.html");
	test = report.startTest("TestName");
	System.out.println(System.getProperty("user.dir"));
 }
 
  @Test
  public void login() throws Exception  {
	  lp.loginApplication(prop.getProperty("username"), prop.getProperty("password"));
	  test.log(LogStatus.FAIL,"test case passed");
	  test.log(LogStatus.PASS, test.addScreenCapture(captureScreenshot("Login")));
	 
  }
//  @Test
//  public void verifyTitle() throws Exception  {
//	  lp.loginApplication(prop.getProperty("username"), prop.getProperty("password"));
//	  Assert.assertEquals(driver.getTitle(), "Guru99 Bank Manager HomePage");
//	 
//  }

  @AfterMethod
  public void logout() {
	  report.endTest(test);
	  report.flush();
		
	  
  }

}
