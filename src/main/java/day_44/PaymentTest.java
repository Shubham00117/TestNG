package day_44;

import org.testng.annotations.Test;

public class PaymentTest 
{
	@Test(priority = 1,groups = {"sanity","regression","functional"})
	void paymentbygpay()
	{
		System.out.println("Payment by gpay");
	}
	@Test(priority = 1,groups = {"sanity","regression","functional"})
	void paymentbypaytm()
	{
		System.out.println("Payment By paytm");
	}
}
