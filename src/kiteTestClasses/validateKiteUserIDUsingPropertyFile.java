package kiteTestClasses;

import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import kiteBase.Base;
import kiteBase.BaseNew;
import kiteUsingPOM.kiteHomePage;
import kiteUsingPOM.kiteLoginPage;
import kiteUsingPOM.kitePinPage;
import kiteUtility.Utility;
import kiteUtility.UtilityNew;

@Listeners(kiteUtility.Listener.class)
public class validateKiteUserIDUsingPropertyFile extends BaseNew{
	
	kiteHomePage home;
	kiteLoginPage login;
	kitePinPage pin;
	
	@BeforeClass
    public void launchBrowser() throws IOException
    {
	  openApplication();
	  login = new kiteLoginPage(driver);
	  pin= new kitePinPage(driver);
	  home= new kiteHomePage(driver);
    }
	 
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException
	{
	
		login.sendUserId(UtilityNew.readDataFromPropertyFile("UN"));
		login.sendPassword(UtilityNew.readDataFromPropertyFile("PWD"));
		login.clickOnLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		pin.sendPin(UtilityNew.readDataFromPropertyFile("PIN"));
		pin.clickOnContinueButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	
	@Test
    public void kiteUserValidation() throws EncryptedDocumentException, IOException {
		String TCID = "123456";
		Assert.assertEquals(home.getActualUserID(),UtilityNew.readDataFromPropertyFile("UN1"), "TC faled actual and Expected User ID Not matching");
	    Assert.fail();
		// Utility.captureScreenShot(driver, TCID);
	  }
	
	@AfterMethod
	public void LogOutFromKiteApp() throws InterruptedException
	{
	home.clickOnLogOutButton();
	}
	
	@AfterClass
	public void closeBrowser()
	{
	driver.close();
	}

	
}
