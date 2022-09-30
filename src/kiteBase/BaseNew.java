package kiteBase;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

import kiteUtility.UtilityNew;

public class BaseNew 
{

	protected static WebDriver driver;
	public void openApplication() throws IOException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium Java - 4.2.2\\chromedriver_win32 (1)\\chromedriver.exe");

	driver=new ChromeDriver(); 
	driver.manage().window().maximize();
	driver.get(UtilityNew.readDataFromPropertyFile("URL"));
	Reporter.log("launching Kite APP",true);
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	public  void takesScreenShot(String TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Akshay\\TC"+TCID+".png");
		FileHandler.copy(src, dest);
		Reporter.log("Taken Screenshot", true);
	

		

	}
}