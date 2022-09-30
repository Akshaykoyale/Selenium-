package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled_Method {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Java - 4.2.2\\chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement password = driver.findElement(By.xpath("//div[@id='passContainer']"));
	    System.out.println(password.isEnabled());
		
         
		
		
		
		
		
		
		
		
		
		
	}
	

}
