package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
  @Test(priority=1,groups= "grp1")
  public void newcustomer() {
	  System.out.println("this is test case 1");
	  
  }
  @Test(priority=1)
  public void editcustomer() {
	  System.out.println("this is test case 2");
	  
  }
  @Test
  public void editcustomer2() {
	  System.out.println("this is test case 3");
	  
  }
  @Test(priority=4)
  public void customer3() {
	  System.out.println("this is test case 4");
	  
  }
  @BeforeMethod
  public void login() {
	  System.out.println("this is before method annotation");
  }

  @AfterMethod
  public void logout() {
	  System.out.println("this is after method annotation");
  }

}
