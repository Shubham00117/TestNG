package day_43;

import org.testng.Assert;
import org.testng.annotations.Test;

//✅ Assertion in TestNG — is used to verify expected vs actual results; if they don’t match, the test fails.


public class Assertions 
{
	String str1="Openshop";
	String str2="Openshop";
	
	@Test
	void title_Equal() {
//		if(str1.equals(str2))
//		{
//			System.out.println("Test Pass");
//			
//		}
//		else 
//		{
//			System.out.println("Test Faild");
//		}
		
//		Assert.assertEquals(str1, str2); //using Assertion inbuilt method
		
		if(str1.equals(str2))
			{
				System.out.println("Test Pass");
				Assert.assertTrue(true);
				
				
			}
			else 
			{
			System.out.println("Test Faild");
			Assert.assertTrue(false);//throw exception
			}
	}
	
	

}
