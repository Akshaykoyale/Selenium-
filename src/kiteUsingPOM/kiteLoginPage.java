package kiteUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteLoginPage {
	
	//1. Data member should be declared globally with access level private using @findBy Annotation

	@FindBy(id="userid")private WebElement UserID;
	@FindBy(id="password")private WebElement Password;
	@FindBy(xpath="//button[@type='submit']")private WebElement LoginButton;
	
	//2. Initialize within a constructor with access level public using pagefactory 
	
	public kiteLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//3. Utilize within a method with access level public
	
	public void sendUserId(String string)
	{
	UserID.sendKeys("ELR321");
	}
	public void sendPassword(String string)
	{
	Password.sendKeys("Dhana1111");
	}
	public void clickOnLoginButton()
	{
	LoginButton.click();
	}
	
}
