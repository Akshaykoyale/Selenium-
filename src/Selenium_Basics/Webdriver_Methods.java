package Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Methods {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Java - 4.2.2\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		// Webdriver methods
		
		//1. get method----> to open webpage
		//driver.get("https://vctcpune.com/");
		//driver.get("http://google.com/");
		//Thread.sleep(1000);
		
		//2. close method----> to close current webpage
		//driver.close();
		
		//3. quit method----> to close all web pages
		//driver.quit();
		
		//4. maximize, minimize method
		//driver.manage().window().maximize();
		//Thread.sleep(2000);
		//driver.manage().window().minimize();
		
		//5. navigate method-----> to navigate wen page like forward, backword, refresh
		driver.navigate().to("https://www.facebook.com/");
	     Thread.sleep(1000);
	    driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
	    driver.navigate().refresh();
	    Thread.sleep(1000);
	    driver.navigate().to("https://www.instagram.com/");
	    
	    //6. getTitle method:-this method is use to get title of a webpage. return type of getTitle method is String.
	    driver.get("https://vctcpune.com/");
		Thread.sleep(300);
		System.out.println(driver.getTitle());
		driver.get("https://www.google.com/");
		String Title = driver.getTitle();
		System.out.println("Title is "+Title);

		//7. getCurrentURL: this method is use to get URL of a webpage. return type of getCurrentURL method is String
		driver.get("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		
		
		
		
		

	}

}