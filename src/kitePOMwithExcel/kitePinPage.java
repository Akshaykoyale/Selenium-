package kitePOMwithExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitePinPage {
	
	//1. Data member should be declared globally with access level private using @findBy Annotation

		@FindBy(id = "pin") private WebElement pin ;
		@FindBy(xpath = "//button[@type='submit']") private WebElement continueButton;
		
		//2.Initialize within a constructor with access level public using Pagefactory 
		
		public kitePinPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//3.Utilize within a method with access level public
		
		public void sendPin(String PIN)
		{
		pin.sendKeys(PIN);
		}
		public void clickOnContinueButton()
		{
		continueButton.click();
		}
		

}
