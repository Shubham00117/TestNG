package day_44;

import org.testng.annotations.Test;

public class SignUpTest {
	
	@Test(priority = 1,groups = {"regression"})
	void signupbyemail()
	{
		System.out.println("signup By Email");
	}
	
	@Test(priority = 2,groups = {"regression"})
	void signupbyfacbook()
	{
		System.out.println("signup By facebook");
	}
	
	@Test(priority = 3,groups = {"regression"})
	void signupbyX()
	{
		System.out.println("signup By X");
	}

}
