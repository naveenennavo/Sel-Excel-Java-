package excelsheetcode;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		XSSFWorkbook wb=new XSSFWorkbook("./data/test.xlsx");
		@SuppressWarnings("unused")
		XSSFSheet sheetAt = wb.getSheetAt(0);
	    
		
		
		
		

	}

}
