package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendKeys_Use {

	public static void main(String[] args) throws InterruptedException {
		
       System.setProperty("webdriver.chrome.driver", "C:\\Selenium Java - 4.2.2\\chromedriver_win32/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       
      //driver.get("https://vctcpune.com/selenium/practice.html");
		//Thread.sleep(2000);
		//driver.manage().window().maximize();
		//Thread.sleep(5000);
		//1. Sendkeys():
		//driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Hi Akshay");
		//Thread.sleep(5000);
		//2. Clear():
		//driver.findElement(By.xpath("//input[@id='autocomplete']")).clear();
		
		driver.get("https://facebook.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Akshaykoyale25@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Akshay25#");
		Thread.sleep(3000);
		
		//3. click():
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@aria-label='Search Facebook'])[1]")).sendKeys("Mahesh");
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		

	}

}
