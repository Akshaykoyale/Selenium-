package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNullAndNotNull {
  @Test
  public void myMethod() {
	  
	  String a= null;
	  String b= "Pune";
	  
	//  Assert.assertNotNull(a, "Given value is null hence TC Failed");
	 
	  Assert.assertNull(a, "Given value is not null hence TC is Failed");
	  Assert.fail();
  }
}
