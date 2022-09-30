package PopupStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivision_Popup {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Java - 4.2.2\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		

	}

}
