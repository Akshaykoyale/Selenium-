package testNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOut_Study {
  
	 @Test(timeOut=1000)
	  public void b() throws InterruptedException {
		 Thread.sleep(10000);
	   Reporter.log("b method is running", true);
			}
	 
	
	@Test
	  public void c() {
	   Reporter.log("c method is running", true);
			}
	
	@Test
	  public void d() {
	   Reporter.log("d method is running", true);
			}
	
	@Test
	  public void e() {
	   Reporter.log("e method is running", true);
			}
	
	@Test
	  public void a() {
	   Reporter.log("a method is running", true);
			}

}
