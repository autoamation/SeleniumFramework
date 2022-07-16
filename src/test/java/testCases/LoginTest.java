package testCases;

import java.io.IOException;
import Util.TestUtil;
import org.apache.log4j.Logger;

import TestBase.Base;
import pageObjects.LoginPage;

public class LoginTest extends Base {

	public static void main(String[] args) throws Exception {
		Logger log = Logger.getLogger(LoginTest.class);
		LaunchBrowser();
		log.info("launched url");
		//Login loginPg = PageFactory.initElements(driver, Login.class);
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(prop.getProperty("username"));
		log.info("enter username");
		lp.setPassword("mYzazyb");
		log.info("enter password");
		lp.loginbtn();
		TestUtil util = new TestUtil();
		captureScreenshot("apllication opened");
		log.info("clicked on login button");
		log.debug("appliaction launched debug");
		log.warn("appliaction launched warn");
		log.fatal("appliaction launched fatal");
		log.error("appliaction launched error");
		captureScreenshot("s1");
		System.out.println(System.getProperty("user.dir"));

	}

}
