package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File MyFile = new File("D:\\Group A mock result.xlsx");
		
		Workbook MyWorkbook = WorkbookFactory.create(MyFile);
		Sheet MySheet = MyWorkbook.getSheet("Sheet1");
		Row MyRow = MySheet.getRow(16);
		Cell MyCell = MyRow.getCell(1);
		String MyCellInfo = MyCell.getStringCellValue();
		System.out.println(MyCellInfo);
		
		System.out.println( MySheet.getRow(16).getCell(6).getNumericCellValue());
		
		
		
		
		
		

	}

}
