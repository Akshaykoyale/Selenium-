package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueAndAssertFalse {
  @Test
  public void myMethod() {
	  
	  boolean a = true;
	  boolean b= false;
	 
	 
	  // I want to verify value is true or not
	 
	  //Assert.assertTrue(a, "TC is failed");
	  
	 Assert.assertFalse(a, "TC is Failed A value is true"); 
	  
  }
}
