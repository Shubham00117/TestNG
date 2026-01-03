package day_43;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Before_After_Methods_Anotations {
	@BeforeMethod//run before every test method
	void login()
	{
		System.out.println("Login Successfully");
	}
	
	@Test(priority = 1)
	void Search()
	{
		System.out.println("Search");
	}
	
	@Test(priority = 2)
	void AdvanceSearch()
	{
		System.out.println("AdvanceSearch");
	}
	
	@AfterMethod//run after every test method
	void logout()
	{
		System.out.println("Logout successfully");
	}

}
