package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomerPage {
	WebDriver driver;
	public NewCustomerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name =  "name")
    WebElement custnametxtbox;
	
	@FindBy(name = "rad1")
    WebElement genderradiobtn;
	
	@FindBy(name = "dob")
    WebElement dob;
	
	@FindBy(name = "addr")
    WebElement addtxtbox;
	
	@FindBy(name = "city")
    WebElement citytxtbox;
	
	@FindBy(name = "state")
    WebElement statetxtbox;
	
	@FindBy(name = "pinno")
    WebElement pincodetxtbox;
	
	@FindBy(name = "telephoneno")
    WebElement mobilenumbertxtbox;
	
	@FindBy(name = "emailid")
    WebElement mailtxtbox;
	
	@FindBy(name = "password")
    WebElement passowrdtxtbox;
	
	@FindBy(name = "sub")
    WebElement btnSubmit;
	

	public void custName(String cname) {
		custnametxtbox.sendKeys(cname);
		
	}

	public void custgender(String cgender) {
		genderradiobtn.click();
	}

	public void custdob(String mm,String dd,String yy) {
		dob.sendKeys(mm);
		dob.sendKeys(dd);
		dob.sendKeys(yy);
	}

	public void custaddress(String caddress) {
		addtxtbox.sendKeys(caddress);
	}

	public void custcity(String ccity) {
		citytxtbox.sendKeys(ccity);
	}

	public void custstate(String cstate) {
		statetxtbox.sendKeys(cstate);
	}

	public void custpinno(String cpinno) {
		pincodetxtbox.sendKeys(String.valueOf(cpinno));
	}

	public void custtelephoneno(String ctelephoneno) {
		mobilenumbertxtbox.sendKeys(ctelephoneno);
	}

	public void custemailid(String cemailid) {
		mailtxtbox.sendKeys(cemailid);
	}

	public void custpassword(String cpassword) {
		passowrdtxtbox.sendKeys(cpassword);
	}

	public void custsubmit() {
		btnSubmit.click();
	}
	
	
	


}
