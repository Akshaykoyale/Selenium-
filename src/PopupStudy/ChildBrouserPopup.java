package PopupStudy;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class ChildBrouserPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Java - 4.2.2\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(1000);
		
		// to get single id(main page)-->
		String idOfMainPage = driver.getWindowHandle();
		System.out.println(idOfMainPage);
		
		//to get multiple ids-->
		Set<String> idOfAllPages = driver.getWindowHandles();
		System.out.println(idOfAllPages);
		
		// convert set into ArrayList
		ArrayList<String> al = new ArrayList<String> (idOfAllPages);
				
		String newidOfMainPage = al.get(0);
		String idOfChildPage = al.get(1);
		
		//switch focus from main page to child page
		driver.switchTo().window(idOfChildPage);
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@class='field searchform-s'])[4]")).sendKeys("Selenium");
		Thread.sleep(2000);
        driver.switchTo().window(newidOfMainPage);
        String text = driver.findElement(By.xpath("//p[text()='Click below to open link in new browser window']")).getText();
		System.out.println(text);
	}

}
