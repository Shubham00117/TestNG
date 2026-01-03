package day_43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnotations {
	

	//@BeforeSuite   → Runs once before all tests in the entire suite (e.g., start report, setup config)

	//@AfterSuite    → Runs once after all tests in the suite (e.g., close report, cleanup)

	//@BeforeTest    → Runs before <test> tag in testng.xml (e.g., open DB connection)

	//@AfterTest     → Runs after <test> tag in testng.xml (e.g., close DB connection)

	//@BeforeClass   → Runs once before the first @Test method in the current class (e.g., launch browser)

	//@AfterClass    → Runs once after all @Test methods in the current class (e.g., close browser)

	//@BeforeMethod  → Runs before each @Test method (e.g., login or navigate)

	//@AfterMethod   → Runs after each @Test method (e.g., logout or clear cookies)

	//@Test          → Defines the actual test case (contains test logic)

	
	@BeforeSuite
	void bs()
	{
		System.out.println("Before Suite");
	}
	@AfterSuite
	void as()
	{
		System.out.println("After Suite");
		
	}
	@BeforeTest
	void bt()
	{
		System.out.println("Before test");
	}
	@AfterTest
	void at() 
	{
		System.out.println("After test");
	}
	@BeforeClass
	void bc()
	{
		System.out.println("Before class");
	}
	@AfterClass
	void ac()
	{
		System.out.println("After class");
	}
	@BeforeMethod
	void bm()
	{
		System.out.println("Before Method");
	}
	@AfterMethod
	void am()
	{
		System.out.println("After Method");
	}
	@Test
	void test1()
	{
		System.out.println("Test1");
	}
	@Test
	void test2()
	{
		System.out.println("Test2");
	}

}
