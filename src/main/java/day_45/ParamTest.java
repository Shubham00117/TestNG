package day_45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest {
	
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser"})//parameter pass from xml file 
	void setup(@Optional("chrome") String br)//parameter is not pass by default execute optional parameter
	{
		//Parallel Browser test using switch case test 
		switch (br) {
		case "chrome":
			driver =new ChromeDriver();
			break;
		case "safari":
			driver =new SafariDriver();
			break;
		case "edge":
			driver =new EdgeDriver();
			break;
		default:
			return;//wrong parameter pass stop the execution
		}
		
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
		Assert.assertEquals(driver.getTitle(), "Account Login");
	}
	
	@Test(priority = 3)
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
