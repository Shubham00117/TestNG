package day_47;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//without using page factory
public class LoginTest {
	
	WebDriver driver;
	@BeforeClass
	void setUp()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
//	@Test
//	void login1() 
//	{
//		LoginPage1 lp1=new LoginPage1(driver);
//		lp1.setusername("Admin");
//		lp1.setpassword("admin123");
//		lp1.clickbtnLogin();
//		
//	}
//	@Test
//	void login2() 
//	{
//		LoginPage2 lp2=new LoginPage2(driver);
//		lp2.setusername("Admin");
//		lp2.setpassword("admin123");
//		lp2.clickbtnLogin();
//		
//	}
	@Test
	void login() 
	{
		LoginPage3 lp3=new LoginPage3(driver);
		lp3.usernamesend("Admin");
		lp3.passwordsend("admin123");
		lp3.clickloginbtn();
	}
	
	@AfterClass
	void teardown()
	{
		driver.quit();
	}
}
