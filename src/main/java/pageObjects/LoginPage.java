package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="uid")
    WebElement usernametxtbox;
	
	@FindBy(name="password")
    WebElement passwordtxtbox;
	
	@FindBy(name="btnLogin")
    WebElement loginbtn;
	
	
	public void setUserName(String uname) {
		usernametxtbox.sendKeys(uname);
	}
	
	public void setPassword(String pwd) {
		passwordtxtbox.sendKeys(pwd);
	}
	
	public void loginbtn() {
		loginbtn.submit();
	
	}
	public void loginApplication(String userName, String password) {
		setUserName(userName);
		setPassword(password);
		loginbtn();
	
	}
}
