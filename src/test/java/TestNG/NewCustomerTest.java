package TestNG;

import org.testng.annotations.Test;

import TestBase.Base;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.NewCustomerPage;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NewCustomerTest extends Base{
	LoginPage lp;
	HomePage hp;
	NewCustomerPage cp;
	 Logger log;
  @Test
  public void Test() throws Exception {
	  hp.clickOnNewCustomer();

	  	cp.custName("Pavan");
		cp.custgender("male");
		cp.custdob("10","15","1985");
		Thread.sleep(5000);
		cp.custaddress("INDIA");
		cp.custcity("HYD");
		cp.custstate("AP");
		cp.custpinno("5000074");
		cp.custtelephoneno("987890091");
		
		String email=randomestring()+"@gmail.com";
		cp.custemailid(email);
		cp.custpassword("abcdef");
		cp.custsubmit();
		
		Thread.sleep(3000);
		
		log.info("validation started....");
		
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			log.info("test case passed....");
			
		}
		else
		{
			log.info("test case failed....");
			captureScreenshot("addNewCustomer");
			Assert.assertTrue(false);
		}
			
	  
  }
  @BeforeMethod
  public void beforeMethod() throws Exception {
	log = Logger.getLogger(LoginTest.class);
	  LaunchBrowser();
	  lp = new LoginPage(driver);
	  cp = new NewCustomerPage(driver);
	  hp = new HomePage(driver);
	  lp.loginApplication(prop.getProperty("username"), prop.getProperty("password"));
  }

  @AfterMethod
  public void afterMethod() {
	  
  }

}
