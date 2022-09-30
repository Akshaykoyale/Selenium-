package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablePractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Java - 4.2.2\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String URL = "https://courses.letskodeit.com/practice";
		driver.get(URL);

		driver.findElement(By.xpath("//table[@id='product']"));
		List<WebElement> rowsCount = driver.findElements(By.xpath("//table//tr"));
		List<WebElement> coloumCount = driver.findElements(By.xpath("//table//th"));
		List<WebElement> tableData = driver.findElements(By.xpath("//table//tr//td"));

		System.out.println("Rows of Table " + rowsCount.size());
		System.out.println("Coloum of Table " + coloumCount.size());
		System.out.println("Table data count " + tableData.size());
		System.out.println("Table Data");
		System.out.println();

		// loop for printing all table data
	for(int i = 0; i<rowsCount.size(); i++) {
		
		for(int j =i; j<coloumCount.size(); j++) {
				System.out.println(rowsCount.get(j).getText());
				System.out.println();
		}		}
       
		System.out.println("====================");
       // loop for printing header data from row 1
		for (int j = 0; j < coloumCount.size(); j++) {
			System.out.print(coloumCount.get(j).getText());
			System.out.print(" | ");
		}
		System.out.println();

		// loop for printing table data from row 2 to 4
		int d = 0; // variable for Table data Index
		for (int i = 1; i < rowsCount.size(); i++) {

			for (int j = 0; j < 3; j++) {

				System.out.print(tableData.get(d).getText());
				System.out.print(" | ");
				d++;
			}
			System.out.println();
		}

		//driver.close();
	}

	
	}


