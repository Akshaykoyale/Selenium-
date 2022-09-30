package verificationUsingTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PaytmRecharge {
	 @Test
	  public void paytmTest() {
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Selenium Java - 4.2.2\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();	
			
			String url = "https://paytm.com/";
			driver.get(url);
			// using implicit wait
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	 driver.findElement(By.xpath("(//div[text()='Prepaid']")).click();
	 
	 
	 
	 
	 }
	
	}
