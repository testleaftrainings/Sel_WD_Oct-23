package week5.day3;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	
	@Test
	public void readExcelData() throws IOException {
		
		// Open the Excel book
		XSSFWorkbook book = new XSSFWorkbook("./data/CreateLead.xlsx");
		
		// To get the sheet by using index
		// Index starts from zero
		XSSFSheet sheet = book.getSheetAt(0);
		
		
		// get the row count
		// Row count starts from 0 (zero)
		int rowCount = sheet.getLastRowNum();
		System.out.println("rowCount :" +rowCount) ;
		
		//Get the col count
		// Col count starts from 1 (one)
		int colCount = sheet.getRow(0).getLastCellNum();
		System.out.println("colCount : " +colCount);
		
		// To get the value from the particular cell
		// To get the data the index position will starts from 0(zero)
		String stringCellValue = sheet.getRow(2).getCell(1).getStringCellValue();
		System.out.println("stringCellValue  : " +stringCellValue);
		
		
	}
	

}
