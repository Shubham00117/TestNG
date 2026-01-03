package day_47;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
	//using PageFactory
	
		//constructor
		WebDriver driver;
		LoginPage2(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);//mandatory if we not write this line thow nullpointerException
			
		}
		
		//locators
		
		@FindBy(xpath = "//input[@placeholder='Username']") WebElement txt_username_loc;
//		@FindBy(how = How.XPATH, using = "//input[@placeholder='Username']")WebElement txt_username_loc; //alternative way to write code using How class
		@FindBy(xpath = "//input[@placeholder='Password']") WebElement txt_password_loc;
		@FindBy(xpath = "//button[normalize-space()='Login']") WebElement btn_login_loc;
		
		//Actions Methods
		
		void setusername(String uName)
		{
			txt_username_loc.sendKeys(uName);
		}
		
		void setpassword(String pwd)
		{
			txt_password_loc.sendKeys(pwd);
		}
		
		void clickbtnLogin()
		{
			btn_login_loc.click();
		}

}
