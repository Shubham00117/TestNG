package day_43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Before_Class_After_Class_Anotation {
	
	@BeforeClass//run before first test method
	void login()
	{
		System.out.println("Login Successfully");
	}
	@AfterClass//run end of the class test method
	void logout()
	{
		System.out.println("Logout successfully");
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
	
	

}
