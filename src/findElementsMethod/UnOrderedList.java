package findElementsMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnOrderedList {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Java - 4.2.2\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("india");
		Thread.sleep(1000);
		List<WebElement> result = 
		driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
        System.out.println(result.size());
		System.out.println("=================================");
		for(WebElement r:result)// to see list in console
		{
		System.out.println(r.getText());
		}System.out.println("=================================");
		for(WebElement r:result)// to click on specific item--> india vs england
		{
		String expectedResult = "india vs england";
		String actualText=r.getText();
		if(actualText.equals(expectedResult))
		{
		r.click();
		break;
		}
		driver.findElement(By.linkText("Images")).click();

	}}}