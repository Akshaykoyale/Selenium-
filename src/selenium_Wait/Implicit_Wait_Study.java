package selenium_Wait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait_Study {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium Java - 4.2.2\\chromedriver_win32\\chromedriver.exe");
			
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));// latest syntax after selenium 4
		
       
		
		
		
		
		
		
		
		
		
	}

}
