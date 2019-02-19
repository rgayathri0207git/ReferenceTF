package wdmethods;

import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] getExcelData(String excelFileName) throws IOException {
		XSSFWorkbook myBook = new XSSFWorkbook("./data/"+excelFileName+".xlsx");
		XSSFSheet sheet = myBook.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		System.out.println("row count = "+rowCount);
		int colCount = sheet.getRow(0).getLastCellNum();
		System.out.println("column count = "+colCount);
		String[][] data = new String[rowCount][colCount];
		
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j <colCount; j++) {
				XSSFCell cell = row.getCell(j);
				String cellValue = cell.getStringCellValue();
				data[i-1][j] = cellValue;
				System.out.println(cellValue);
			} 
		}
		return data;
	}

}







