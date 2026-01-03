package day_42;

import org.testng.annotations.Test;

public class FirstTestNg {
	
	//Test in test run according to priority
	//if we not specified priority test case execute according to alphabet
	//negative numbers are allowed in priority 
	//0 is allowed in priority
	//-1 0 1... first execute -1 priority test case then 1 then followed by all numbers
	//main method are not needed in testNG class
	//@Test annotation to mandatory to run test case
	@Test(priority = 1)
	void openapp()
	{
		System.out.println("Open app successfully");
	}
	@Test(priority = 2)
	void login()
	{
		System.out.println("Login app successfully");
	}
	@Test(priority =3)
	void logout()
	{
		System.out.println("logout app successfully");
	}
	

}
