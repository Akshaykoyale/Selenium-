package PopupStudy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Java - 4.2.2\\chromedriver_win32\\chromedriver.exe");
		
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(5000);
		
      driver.findElement(By.xpath("//buttons[@id='promtButton']")).click();
		Thread.sleep(1000);
		//main page to alert
		
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();//click on ok button
		driver.findElement(By.xpath("(//span[@class='pr-1'])[1]")).click();
		
		
		
		
		
		
		
		
		

	}

}
