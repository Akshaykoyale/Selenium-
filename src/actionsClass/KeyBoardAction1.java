package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Java - 4.2.2\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url="https://www.facebook.com/r.php?locale=en_GB&display=page";
		driver.get(url);
		
		Actions act = new Actions(driver);
		
		WebElement day = driver.findElement(By.id("day"));
		
		act.click(day).perform();
		Thread.sleep(2000);
		for(int i=0; i<=15; i++) {
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(500);
		}
		act.sendKeys(Keys.ENTER).perform();
		
		WebElement month = driver.findElement(By.id("month"));
		
		act.click(month).perform();
		for(int i=0; i<=2; i++) {
			act.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(500);
			}act.sendKeys(Keys.ENTER).perform();
		
		WebElement year = driver.findElement(By.id("year"));
		
		act.click(year).perform();
		for(int i=0; i<=26; i++) {
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(500);
			}
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(8000);
		driver.close();
	}
             
}
