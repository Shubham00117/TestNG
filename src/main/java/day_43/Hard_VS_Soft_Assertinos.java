package day_43;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Hard_VS_Soft_Assertinos 
{
//	@Test
	//💪 Hard Assertion — stops the test execution immediately when a failure occurs (Assert.assertEquals() etc.).
	void hard_Assertion() 
	{
		System.out.println("Print1");
		System.out.println("Print2");
		Assert.assertEquals(1,2);	//hard assertion
		System.out.println("Print1");
		System.out.println("Print2");
	}
	
	@Test
	//🧩 Soft Assertion — allows the test to continue executing even after failures and reports all failures together at the end (SoftAssert class).
	void soft_Assertion() 
	{
		SoftAssert sa=new SoftAssert();
		System.out.println("Print1");
		System.out.println("Print2");
		sa.assertEquals(1,2);	//soft assertion if assertion is fail also execute below code
		System.out.println("Print1");
		System.out.println("Print2");
		sa.assertAll();
	}
}
