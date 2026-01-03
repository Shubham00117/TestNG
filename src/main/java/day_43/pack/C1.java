package day_43.pack;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1 
{
	@BeforeSuite
	void bs()
	{
		System.out.println("Before suit");
	}
	@BeforeTest
	void abc()
	{
		System.out.println("Before Test");
	}
	@Test
	void login()
	{
	System.out.println("login successfully");	
	}
	
}
