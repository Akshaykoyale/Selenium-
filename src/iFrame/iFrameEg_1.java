package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrameEg_1 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Java - 4.2.2\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
        driver.manage().window().maximize();
        Thread.sleep(3000);
      
        //switch selenium focus from main page to frame
        driver.switchTo().frame("iframe-name");
        Thread.sleep(3000);
      
        //current focus is on frame now
		driver.findElement(By.xpath("(//a[text()='Courses'])[1]")).click();
		Thread.sleep(3000);
		
		// to take action on main page again, we need to switch selenium  focus from frame to main page
		//Driver.switchTo.parentframe(); 
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("checkBoxOption2")).click();
		
	}

}
