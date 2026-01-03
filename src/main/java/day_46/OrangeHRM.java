package day_46;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//@Listeners(day_46.MyListener.class) How to apply Listener class without XML file 
public class OrangeHRM {
	
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
	}
	
	@Test(priority = 1)
	void checkLogo()
	{
	  boolean status=	driver.findElement(By.xpath("//a[normalize-space()='Qafox.com']")).isDisplayed();
	  Assert.assertEquals(status, true);
	  System.out.println("Logo is displayed successfully");
	}
	
	@Test(priority = 2)
	void checkTitle()
	{
		Assert.assertEquals(driver.getTitle(), "Account Loginn");
	}
	
	@Test(priority = 3,dependsOnMethods = {"checkTitle"})
	void checkUrl() 
	{
		Assert.assertEquals(driver.getCurrentUrl(), "https://tutorialsninja.com/demo/index.php?route=account/login");
	}
	
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}

}
