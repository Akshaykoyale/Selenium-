package kiteUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteHomePage {
	
	//1.Data member should be declared globally with access level private using @findBy Annotation

	@FindBy(xpath = "//span[@class='user-id']") private WebElement uid;
	@FindBy(xpath = "//a[@target='_self']")private WebElement logoutButton;
	
	//2.Initialize within a constructor with access level public using PageFactory 
	
	public kiteHomePage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	//3.Utilize within a method with access level public
	
	public void valiteUserId()
	{
	String expectedUserID="ELR321";
	String actualUserID = uid.getText();
	if(expectedUserID.equals(actualUserID))
	{
	System.out.println("Actual and Expected are matching TC is passed");
	}
	else {
	System.out.println("Actual and Expected are not matching TC is failed");
	}
	}
	public void logOut() throws InterruptedException
	{
	uid.click();
	Thread.sleep(200);
	logoutButton.click();
	}

	public Object getActualUserID() {
		// TODO Auto-generated method stub
		return null;
	}

	public void clickOnLogOutButton() {
		// TODO Auto-generated method stub
		
	}

	

}
