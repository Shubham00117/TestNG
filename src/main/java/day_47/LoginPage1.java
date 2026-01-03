package day_47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage1 {
	
	//without using page factory
	//constructor
	WebDriver driver;
	LoginPage1(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	//locators
	
	By txt_username_loc =	By.xpath("//input[@placeholder='Username']");
	By txt_password_loc =	By.xpath("//input[@placeholder='Password']");
	By btn_login_loc	=	By.xpath("//button[normalize-space()='Login']");
	
	//Actions Methods
	
	void setusername(String uName)
	{
		driver.findElement(txt_username_loc).sendKeys(uName);
	}
	
	void setpassword(String pwd)
	{
		driver.findElement(txt_password_loc).sendKeys(pwd);
	}
	
	void clickbtnLogin()
	{
		driver.findElement(btn_login_loc).click();
	}

}
