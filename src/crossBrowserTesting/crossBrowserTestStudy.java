package crossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossBrowserTestStudy {
  @Parameters("BrowserName")
	@Test
  public static void myMethod(String Bname) {
	  
	  WebDriver driver=null ; // Declared driver here
	 
	  if (Bname.equals("chrome")) 
	  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium Java - 4.2.2\\chromedriver_win32 (1)\\chromedriver.exe");
	   driver = new ChromeDriver();
	  }
	  
	  else if(Bname.equals("FireFox"))
	  {
	  System.setProperty("webdriver.gecko.driver", "C:\\Selenium Java - 4.2.2\\geckodriver-v0.31.0-win64\\geckodriver.exe");  
	   driver = new FirefoxDriver();
	  }
	  
	  String url = "https://kite.zerodha.com/";
	  driver.get(url);
	  }
			  
  }

