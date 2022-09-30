package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed_Method {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Java - 4.2.2\\chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
       driver.get("https://vctcpune.com/selenium/practice.html");
		
		WebElement CheckElement = driver.findElement(By.id("displayed-text"));

		System.out.println(CheckElement.isDisplayed());
		
		Thread.sleep(4000);
		
		driver.findElement(By.id("hide-textbox")).click();
		
		Thread.sleep(4000);
		
		System.out.println(CheckElement.isDisplayed());
		
	

	}

}
