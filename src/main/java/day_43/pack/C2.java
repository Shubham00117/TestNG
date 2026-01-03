package day_43.pack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class C2
{
	@AfterSuite
	void as()
	{
		System.out.println("After Suit");
	}
	@AfterTest
	void pqr() {
		System.out.println("After Test");
	}
	@Test
	void search()
	{
		System.out.println("Search Successfully");
	}
}
