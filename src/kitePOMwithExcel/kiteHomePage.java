package kitePOMwithExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteHomePage {

	//1.Data member should be declared globally with access level private using @findBy Annotation

	@FindBy(xpath = "//span[@class='user-id']")private WebElement uID;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logOutButton;
	
		//2.Initialize within a constructor with access level public using PageFactory 
		
		public kiteHomePage(WebDriver driver)
		{
		PageFactory.initElements(driver, this);
		}
		
		//3.Utilize within a method with access level public
		
		public void validateUserID(String expectedUID)
		{
		 String actualUserID = uID.getText();
		 
		 if(actualUserID.equals(expectedUID))
		 {
		 System.out.println("Actual and Expected UserID's are matching TC is PASSED");
		 }
		 
		 else
		 {
		 System.out.println("Actual and Expected UserID's are not matching TC is FAILED");
		 }
		}
		public void clickOnLogOutButton() throws InterruptedException
		{
		uID.click();
		Thread.sleep(200);
		logOutButton.click();
		}
		
}
