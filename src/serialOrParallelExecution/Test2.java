package serialOrParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2 {
	 @Test
	  public void KiteLaunch() {
		  
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium Java - 4.2.2\\chromedriver_win32 (1)\\chromedriver.exe");	
		 WebDriver driver = new ChromeDriver();	
			
			String url = "https://kite.zerodha.com/";
			driver.get(url);}
}
