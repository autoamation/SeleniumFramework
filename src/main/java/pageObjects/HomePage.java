package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	By newCustomerLink = By.linkText("New Customer");
	By editCustomerLink = By.name("Edit Customer"); 
	
	
	
	public void clickOnNewCustomer() {
		driver.findElement(newCustomerLink).click();
	}
	
	public void clickOnEditCustomer() {
		driver.findElement(editCustomerLink).click();
	}
	
	

}
