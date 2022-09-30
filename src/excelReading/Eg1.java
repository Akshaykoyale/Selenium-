package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File myfile = new File ("D:\\Group A mock result.xlsx");
		
		String value =WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(16).getCell(1).getStringCellValue();
		double value1 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(16).getCell(6).getNumericCellValue();
		System.out.println(value + " = " + value1);
		
		
		
		
		
		
		
		
		
	}

}
