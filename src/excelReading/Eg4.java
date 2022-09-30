package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File MyFile = new File("D:\\Group A mock result.xlsx");
		
	    Workbook MyWorkBook = WorkbookFactory.create(MyFile);
	    Sheet MySheet = MyWorkBook.getSheet("Sheet1");
		
	  //reading multiple data from single row
	    for(int i=0; i<=5; i++) {
	    	String row = MySheet.getRow(1).getCell(i).getStringCellValue();
	    	System.out.print(row);
	    	System.out.print("|| ");
	    }
        //reading multiple data from single column
		for (int i=6; i<=25; i++) {
			 String cell = MySheet.getRow(i).getCell(1).getStringCellValue();
			 System.out.println(cell);
		}
		
		
		
		
		
	}

}
