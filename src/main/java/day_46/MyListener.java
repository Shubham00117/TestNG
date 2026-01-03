package day_46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//A Listener in TestNG is a special interface that monitors and reacts to test execution events.
//It listens to what’s happening during the test run (like start, success, failure, skip, etc.) 
//->and lets you perform actions automatically when those events occur.

public class MyListener implements ITestListener{
	
	 public void onStart(ITestContext context) {
		    System.out.println("Test Execution Started");
		  }
	
	 public void onTestStart(ITestResult result) {
	    System.out.println("Test Started");
	  }
	
	 public void onTestSuccess(ITestResult result) {
		 System.out.println("Test Success");
	  }
	
	 public void onTestFailure(ITestResult result) {
	    // not implemented
		 System.out.println("Test faild");
	  }
	
	 public void onTestSkipped(ITestResult result) {
	    // not implemented
		 System.out.println("Test skipped");
	  }
	
	 public void onFinish(ITestContext context) {
	    // not implemented
		 System.out.println("Test execution finished");
	  }

}
