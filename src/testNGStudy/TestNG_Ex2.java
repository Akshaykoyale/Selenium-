package testNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG_Ex2 {
  
	 @Test
	  public void paytmLaunch() {
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Selenium Java - 4.2.2\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();	
			
			String url = "https://paytm.com/";
			driver.get(url);}
	
	
}
