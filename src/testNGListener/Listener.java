package testNGListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener 
 {
    @Override
    public void onTestStart(ITestResult result) 
    {
    	Reporter.log("TC execution is started " +result.getName() , true);
     }
       
	@Override
	public void onTestSkipped(ITestResult result) 
	{
		Reporter.log("TC execution is skipped " +result.getName(), true);
	}
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		Reporter.log("TC execution is failed " + result.getName(), true);
	}
	
	@Override
	public void onTestSuccess(ITestResult result)
	{
		Reporter.log("TC execution is successful " + result.getName(), true);	
	}
	
	@Override
	public void onFinish(ITestContext result)
	{
		Reporter.log("TC execution is finish "+ result.getName(), true);
	}
	
      @Override
        public void onStart(ITestContext result) 
        {
        	Reporter.log("Tc Execution is Start" +result.getName());
        }
	
	
}


