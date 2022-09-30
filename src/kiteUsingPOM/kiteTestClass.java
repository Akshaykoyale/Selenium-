package kiteUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kiteTestClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		kiteLoginPage login = new kiteLoginPage(driver);
		login.sendUserId(null);
		login.sendPassword(null);
		login.clickOnLoginButton();
		Thread.sleep(2000);
		
		kitePinPage pin = new kitePinPage(driver);
		pin.sendPin(null);
		pin.clickOnContinueButton();
		Thread.sleep(2000);
		
		kiteHomePage home = new kiteHomePage(driver);
		home.valiteUserId();
		home.logOut();
		Thread.sleep(2000);
		
		driver.close();
		
		
	}

}
