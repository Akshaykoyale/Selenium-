package testNGXML_Study;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class testXML1 {
  @Test
  public void a() {
	  Reporter.log("a method is running", true);
  }
  @Test
  public void b() {
	  Reporter.log("b method is running", true);
  }
  @Test
  public void c() {
	  Assert.fail();
	  Reporter.log("c method is running", true);
  }
  
}
