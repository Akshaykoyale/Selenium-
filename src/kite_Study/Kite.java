package kite_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kite {

	public static void main(String[] args) throws InterruptedException {
 {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Java - 4.2.2\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		
		String url = "https://kite.zerodha.com/";
		driver.get(url);
		
		driver.findElement(By.id("userid")).sendKeys("ELR321");
		driver.findElement(By.id("password")).sendKeys("Dhana1111");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("pin")).sendKeys("982278");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		WebElement UID = driver.findElement(By.xpath("//span[@class='user-id']"));
		UID.click();
		String actualID = UID.getText();
		String expectedID= "ELR321";
		 
		if (actualID.equals(expectedID))
		{
			System.out.println("text case is pass");
		}
		else {
			System.out.println("taxt case is fail");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@target='_self']")).click();
		Thread.sleep(2000);
		driver.close();
	}



	}

}
