package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File MyFile = new File("D:\\Group A mock result.xlsx");
		
		Workbook MyWorkBook = WorkbookFactory.create(MyFile);
		Sheet MySheet = MyWorkBook.getSheet("Sheet1");
		//reading numeric value
        double value = MySheet.getRow(16).getCell(6).getNumericCellValue();
		System.out.println(value);
		
		//reading boolean value
		Cell MyCell = MySheet.getRow(26).getCell(1);
		System.out.println(MyCell.getCellType());
		System.out.println(MyCell.getBooleanCellValue());
		
		//reading string cell Value
		Cell myCell1 = MySheet.getRow(16).getCell(1);
		System.out.println(myCell1.getCellType());
		System.out.println(myCell1.getStringCellValue());
		

	}

}
