package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected_Method {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Java - 4.2.2\\chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https:facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
        Thread.sleep(3000);
        WebElement male = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
      // System.out.println(driver.findElement(By.xpath("(//input[@type='radio'])[2]")).isSelected());
        boolean result = male.isSelected();
        System.out.println(result);
        
        male.click();
        boolean result1 = male.isSelected();
        System.out.println(result1);
        
        if (result1==true)
        {
        	System.out.println("button is selected");
        	
        }
        else {
        	System.out.println("button is not selected");
        }
	}
        
        
        
        
        
        
        
        
        
	}
	
	
	


