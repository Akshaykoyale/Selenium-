package kiteUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import kiteBase.BaseNew;

public class Listener extends BaseNew implements ITestListener 
{
	BaseNew b= new BaseNew();
    @Override
    public void onTestStart(ITestResult result) 
    {
    	result.getName();
    	Reporter.log("TC execution is started " +result.getName() , true);
     }
       
	@Override
	public void onTestSkipped(ITestResult result) 
	{
		Reporter.log("TC execution is skipped " + result.getName(), true);
	}
	
	public void onTestFailure(ITestResult result)
	{
		Reporter.log("TC execution is Failed " + result.getName(), true);
		String TCname = result.getName();
		try {
			b.takesScreenShot(TCname);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		Reporter.log("TC execution is start "+result.getName(), true);
	}
}


