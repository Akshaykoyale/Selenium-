package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShot2 {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver","C:\\Selenium Java - 4.2.2\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https:facebook.com");
		
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
           // System.out.println(src);
		
		String str=RandomString.make(3);//to add random string this will avoid overrwriting of file

		File sends = new File("C:\\Akshay\\facebook"+str+".png");
		FileHandler.copy(src, sends);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
