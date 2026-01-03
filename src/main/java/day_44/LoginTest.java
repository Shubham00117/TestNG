package day_44;

import org.testng.annotations.Test;

public class LoginTest {
	//Groups in TestNG groups is used to categorize test methods so you can run specific sets of tests together instead of all tests every time.
	
	@Test(priority = 1,groups = {"sanity"})
	void loginbyemail()
	{
		System.out.println("Login By Email");
	}
	
	@Test(priority = 2,groups = {"sanity"})
	void loginbyfacbook()
	{
		System.out.println("Login By facebook");
	}
	
	@Test(priority = 3,groups = {"sanity"})
	void loginbyX()
	{
		System.out.println("Login By X");
	}
}
