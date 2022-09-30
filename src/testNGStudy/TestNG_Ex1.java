package testNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestNG_Ex1 {
  @Test
  public void KiteLogin() {
	  
	  //System.setProperty("webdriver.chrome.driver", "C:\\Selenium Java - 4.2.2\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();	
	
	System.setProperty("webdriver.gecko.driver", "C:\\Selenium Java - 4.2.2\\geckodriver-v0.31.0-win64\\geckodriver.exe");  
	WebDriver driver = new FirefoxDriver();
	
		String url = "https://kite.zerodha.com/";
		driver.get(url);}
		
		
				
  
}
