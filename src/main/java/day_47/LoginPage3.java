package day_47;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage3 {
	
	WebDriver driver;
	//constructor
	public LoginPage3(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);//mandatory if we not write this line thow nullpointerException
		
	}
	
	//locators
	
	@FindBy(xpath = "//input[@placeholder='Username']")WebElement username;
	@FindBy(xpath = "//input[@placeholder='Password']")WebElement passowrd;
	@FindBy(xpath = "//button[normalize-space()='Login']") WebElement btnlogin;
	
	//Actions Methods
	void usernamesend(String usen)
	{
		username.sendKeys(usen);
	}
	
	void passwordsend(String pwd)
	{
		passowrd.sendKeys(pwd);
	}
	
	void clickloginbtn()
	{
		btnlogin.click();
	}

}
