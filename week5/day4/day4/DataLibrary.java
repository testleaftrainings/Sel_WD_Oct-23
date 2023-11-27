package week5.day4;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataLibrary {
	
	
	public static String[][] readData(String fileName) throws IOException {
	
		XSSFWorkbook book = new XSSFWorkbook("./data/"+fileName+".xlsx");
		
		XSSFSheet sheet = book.getSheet("Sheet1");
		
		int rowCount = sheet.getLastRowNum();
		
		int colCount = sheet.getRow(0).getLastCellNum();
		
		String[][] data = new String[rowCount][colCount];
		
		for(int i=1;i<=rowCount;i++) {
			for (int j = 0; j <colCount; j++) {
				String cellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(cellValue);
				data[i-1][j]= cellValue;
			}
			}
		
		book.close();
		return data;
	}

}
