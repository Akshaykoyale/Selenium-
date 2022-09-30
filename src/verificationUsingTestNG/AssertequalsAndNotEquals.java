 package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertequalsAndNotEquals {
  @Test
  public void MyMethod() {
	  
	  String a ="Pune";
	  String b= "Pune";
	  String c= "Latur";
	  
	  //1.If a and b are equal TC should be PASSED
	  //I want to verify a equals b, equals c we will be using Hard Assert to verify
	  
	 // Assert.assertEquals(a, c, "A is not equal to C TC is FAILED");
	 
	  Assert.assertNotEquals(a, c, "A and B are equal TC is FAILED");
	  
	  
  }
}
