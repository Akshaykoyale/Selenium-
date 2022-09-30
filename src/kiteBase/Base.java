package kiteBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Base {
	
	protected WebDriver driver;
	public void openApplication()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium Java - 4.2.2\\chromedriver_win32 (1)\\chromedriver.exe");

	driver=new ChromeDriver(); 
	driver.manage().window().maximize();
	driver.get("https://kite.zerodha.com/");
	Reporter.log("launching Kite APP",true);
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	}


