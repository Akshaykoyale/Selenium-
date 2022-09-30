package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxEg_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Java - 4.2.2\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(3000);
		
		WebElement day = driver.findElement(By.id("day"));
		Select s = new Select(day);
		//s.selectByIndex(15);
		//s.selectByValue("25");
		//s.selectByVisibleText("28");
		System.out.println(s.isMultiple());
		
		// using for loop for multiple times operations
		for (int i=0; i<=20; i++) {
			s.selectByIndex(i);
			Thread.sleep(1000);
		}
		for(int i=20;i>=0;i--){
		   s.selectByIndex(i);
		   Thread.sleep(300);
		}	
		
		
		
		
		
		
		
		
		
		

	}

}
