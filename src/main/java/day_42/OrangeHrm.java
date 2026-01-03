package day_42;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHrm {
	WebDriver driver;//create variable of driver
	
	
	@Test(priority = 1)
	void openapp()
	{
		driver=new ChromeDriver();//create instance of driver
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	@Test(priority = 2)
	void checklogo() 
	{
	boolean status=	driver.findElement(By.xpath("//div[@class='orangehrm-login-branding']")).isDisplayed();
	if(status)
	{
		System.out.println("Logo is displayed");
	}
	else
	{
		System.out.println("Logo is not displayed");
	}
	}
	@Test(priority = 3)
	void loginapp()
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		System.out.println("Login Successfully");
	}
	@Test(priority = 4)
	void logoutapp()
	{
		driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
		System.out.println("Logout Successfully");
		driver.quit();
	}
}
