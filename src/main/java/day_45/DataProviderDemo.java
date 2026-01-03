package day_45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	WebDriver driver;
	
	@BeforeClass
	void setup() {
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
//	✅ DataProvider → Supplies multiple sets of data to a single test method for data-driven testing.
//	⚙️ It returns data in the form of Object[][] or Iterator<Object[]>.
//	🔁 The test runs multiple times, once for each data set provided.
	@Test(dataProvider = "ss")//pass DataProvider method using DataProvider name.
	void testLogin(String email,String pwd) throws InterruptedException
	{
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		Thread.sleep(2000);
		
		boolean status=	driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
		if(status) 
		{
			System.out.println("Text is Displayed Successfully");
			Assert.assertTrue(true);
		}
		else 
		{
			Assert.fail();
		}
		
		driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
		Thread.sleep(2000);
	}
	
	@DataProvider(name = "ss")//DataProvider name is mandatory
	Object[][] testData()
	{
		Object[][] data= {
						 {"Shubhamshinde5150@gmail.com","Okokok@1231"},
						 {"Shubhamshinde5150@gmail.com","Okokok@1232"},
						 {"Shubhamshinde5150@gmail.com","Okokok@123"},
						 {"Shubhamshinde5150@gmail.com","Okokok@1233"},
						 {"Shubhamshinde5150@gmail.com","Okokok@1234"}
						 };
		return data;
	}
	
	@AfterClass
	void teardown() 
	{
		
		driver.close();
	}

}
