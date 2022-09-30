package actionsClass;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MovetoElementStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Java - 4.2.2\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		
       //1.to take mouse actions, need to create object of Actions class and pass webDriver object as parameter
		
		Actions act = new Actions(driver);
		
		//2. find Eelement to be act
		WebElement aboutUs = driver.findElement(By.xpath("//a[text()='About Us']"));
		
		//3. now take action and perform
		act.moveToElement(aboutUs).perform();
		// using WebElement method
		//aboutUs.click(); 
		//click method using action class
		//act.click().perform();
		//I want click to click on radio button
		WebElement radio2 = driver.findElement(By.xpath("//input[@value='Radio2']"));
        act.moveToElement(radio2).perform();
        //radio2.click();
        //act.click().perform();
        act.moveToElement(radio2).click().build().perform();
        act.click(radio2).perform();

        
        
		

	}

}
