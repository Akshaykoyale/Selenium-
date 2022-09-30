package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablePractice1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Java - 4.2.2\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String url="https://vctcpune.com/selenium/practice.html";
		driver.get(url);
		Thread.sleep(2000);
		// Find no of rows
		List<WebElement> NoOfRows = driver.findElements(By.xpath("(//table[@id='product']//tr)"));
		System.out.println("No Of Rows is " + NoOfRows.size());
		
		// Find no of Columns
		List<WebElement> NoOfColumns = driver.findElements(By.xpath("(//table[@id='product']//tr)[1]//th"));
		System.out.println("No Of Columns is " + NoOfColumns.size());
        List<WebElement> TableData = driver.findElements(By.xpath("(//table[@id='product']//tr)//td"));
        
		// to print header in table
		for( WebElement c:NoOfColumns) {
			System.out.print(c.getText()+ " || ");
		}System.out.println();
	
		for(WebElement r:NoOfRows) {
			System.out.println(r.getText() + "||");
		}System.out.println("=============================================");
		
		 // loop for printing header data from row 1
		for (int j = 0; j < NoOfColumns.size(); j++) {
			System.out.print(NoOfColumns.get(j).getText());
			System.out.print(" || ");
		}
		System.out.println();

		// loop for printing table data from row 2 to 11
		int d = 0; // variable for Table data Index
		for (int i = 1; i < NoOfRows.size(); i++) {

			for (int j = 0; j < 3; j++) {

				System.out.print(TableData.get(d).getText());
				System.out.print(" || ");
				d++;
			}
			System.out.println();
		

	}


}}