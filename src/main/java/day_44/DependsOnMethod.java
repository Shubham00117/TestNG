package day_44;

import org.testng.Assert;
import org.testng.annotations.Test;

//dependsOnMethods in TestNG It is used when one test method depends on the successful execution of another test method.
public class DependsOnMethod {

	@Test(priority = 1)
	void openapp()
	{
		Assert.assertTrue(true);//pass
	}
	
	@Test(priority = 2,dependsOnMethods = {"openapp"})
	void login()
	{
		//pass
	}
	
	@Test(priority = 3,dependsOnMethods = {"login"})
	void search()
	{
		//fail
		Assert.assertTrue(false);
	}
	
	@Test(priority = 4,dependsOnMethods = {"login","search"})
	void advSearch()
	{
		//skip because of login method fail
	}
	
	@Test(priority = 5,dependsOnMethods = {"login"})
	void logout()
	{
		//pass
	}
}
