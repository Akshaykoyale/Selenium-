package kitePOMwithExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class kiteTestwithExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

     System.setProperty("webdriver.chrome.driver", "C:\\Selenium Java - 4.2.2\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		//opt.addArguments("--headless");
		//opt.addArguments("--disable-notifications");
        opt.addArguments("incognito");
        WebDriver driver = new ChromeDriver(opt);
        driver.get("https://kite.zerodha.com/");
		
		File myfile = new File("C:\\Users\\Akshay\\Desktop\\exel.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		String UN = mysheet.getRow(0).getCell(0).getStringCellValue();
		
		kiteLoginPage login = new kiteLoginPage(driver);
		login.sendUserId(UN);
		login.sendPassword(mysheet.getRow(0).getCell(1).getStringCellValue());
		login.clickOnLoginButton();
		Thread.sleep(2000);
		
		kitePinPage pin = new kitePinPage(driver);
		pin.sendPin(mysheet.getRow(0).getCell(2).getStringCellValue());
		pin.clickOnContinueButton();
		Thread.sleep(2000);
		
		kiteHomePage home= new kiteHomePage(driver);
		home.validateUserID(mysheet.getRow(0).getCell(0).getStringCellValue());
		home.clickOnLogOutButton();
		Thread.sleep(2000);
		driver.close();
		
	}

}
