package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertStudy {
  @Test
  public void Mymethod() {
	  
		 String a= "test";
	     String b = null;
	     String c = "test";
		  
		SoftAssert soft = new SoftAssert();
		
		soft.assertNotNull(b, "TC is failed b value is null");
		soft.assertNull(a, "TC is failed a value is not null");
		soft.assertEquals(a, c, "TC is failed if a & c is not aquals"); 
		
	     soft.assertAll();
	 
	     //  Assert.assertNotNull(b, "TC is failed b value is null");
		 //  Assert.assertNull(a, "TC is failed a value is not null");
		  
}
}