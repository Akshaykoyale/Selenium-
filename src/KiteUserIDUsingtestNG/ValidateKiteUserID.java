package KiteUserIDUsingtestNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateKiteUserID {
  
	WebDriver driver;
	File myFile;
	Sheet mySheet;
	kiteLoginPage login;
	kitePinPage pin;
	kiteHomePage home;
	
	
	@BeforeClass
	public void LaunchBrowser() throws EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Java - 4.2.2\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		Reporter.log("Launching Kite App", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	    myFile = new File ("C:\\Users\\Akshay\\Desktop\\exel.xlsx");
		mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		login = new kiteLoginPage(driver);
		pin = new kitePinPage(driver);
		home = new kiteHomePage(driver);
	}
	@BeforeMethod
	public void LoginToKite()
	{
	login.sendUserId(mySheet.getRow(0).getCell(0).getStringCellValue());
	Reporter.log("Entering UserID", true);
	login.sendPassword(mySheet.getRow(0).getCell(1).getStringCellValue());
	Reporter.log("Entering Password", true);
	login.clickOnLoginButton();
	Reporter.log("Clicking on Login Button", true);
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	pin.sendPin(mySheet.getRow(0).getCell(2).getStringCellValue());
	Reporter.log("Entering PIN", true);
	pin.clickOnContinueButton ();
	Reporter.log("Clicking on Continue Button", true);
	pin.sendPin(mySheet.getRow(0).getCell(2).getStringCellValue());
	}
	@Test
    public void ValidateUserID()
    {
		String expectedUserID = mySheet.getRow(0).getCell(0).getStringCellValue();
	    String ActualUserID = home.getActualUserID();
	    Reporter.log("Validating Actual and Expected UserID", true);
	    Assert.assertEquals(ActualUserID, expectedUserID, "TC is failed Actual & Expected not match");
	    Reporter.log("Validated Actual & Expected UserID, TC is Pass", true);
    }
	@AfterMethod
	public void LogoutKiteApp() throws InterruptedException
	{
		home.logOut();
		Reporter.log("Clicking on Logout Button", true);
		Thread.sleep(2000);
	}
	@AfterClass
	public void CloseBrowser()
	{
		driver.close();
		Reporter.log("Closing Browser", true);
    }
}
