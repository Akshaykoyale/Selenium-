package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Java - 4.2.2\\chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		Thread.sleep(3000);
		
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//File sends = new File("C:\\Akshay\\goole.png");
		FileHandler.copy(srcfile, new File("C:\\\\Akshay\\\\goole1.png"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

	
}
