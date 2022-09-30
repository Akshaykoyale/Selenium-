package testNGXML_Study;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class testXML2 {
	 @Test
	  public void d() {
		  Reporter.log("d method is running", true);
	  }
	  @Test
	  public void e() {
		  Assert.fail();
		  Reporter.log("e method is running", true);
	  }
	  @Test
	  public void f() {
		 
		  Reporter.log("f method is running", true);
	  }
}



