package testNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class InvocationCount_Study {
 
	@Test(invocationCount=5)
  public void myMethod() {
	
		Reporter.log("myMethod is running", true);
	  	
  }
}
