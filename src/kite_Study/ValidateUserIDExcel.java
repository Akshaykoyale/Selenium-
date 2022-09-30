package kite_Study;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateUserIDExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Java - 4.2.2\\chromedriver_win32\\chromedriver.exe");
		
		File myFile = new File("C:\\Users\\Akshay\\Desktop\\exel.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		String UID = mySheet.getRow(0).getCell(0).getStringCellValue();
	    String PWD = mySheet.getRow(0).getCell(1).getStringCellValue();
		  String PIN = mySheet.getRow(0).getCell(2).getStringCellValue();
				
		WebDriver driver= new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
	
	WebElement UserID = driver.findElement(By.id("userid"));
	WebElement Password = driver.findElement(By.id("password"));
	WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		Thread.sleep(3000);
		UserID.sendKeys(UID);
		Thread.sleep(2000);
		Password.sendKeys(PWD);
		Thread.sleep(2000);
		loginButton.click();
		Thread.sleep(2000);
		WebElement pin = driver.findElement(By.id("pin"));
		WebElement ContinueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		pin.sendKeys(PIN);
		ContinueButton.click();
		Thread.sleep(2000);
		WebElement uID = driver.findElement(By.xpath("//span[text()='ELR321']"));
		
		String expectedID = "ELR321";
		String actualID = uID.getText();
		
		if (expectedID.equals(actualID)) {
			System.out.println("Test case is pass");
		}
		else {
			System.out.println("Test case is failed");
		}
		
		uID.click();
		WebElement logoutButton = driver.findElement(By.xpath("//a[@target='_self']"));
		logoutButton.click();
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
