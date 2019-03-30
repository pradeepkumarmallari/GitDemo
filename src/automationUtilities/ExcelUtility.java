package automationUtilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	private static XSSFSheet excelSheet;
	private static XSSFWorkbook excelWBook;
	private static String excelPath;
	
	public static XSSFWorkbook setExcelFile(String path) {
		
		try {
			FileInputStream ExcelFile=new FileInputStream(path);
			excelWBook=new XSSFWorkbook(ExcelFile);
			excelPath=path;
			
		}
		catch(Exception e) {
			Logging.errorMessage("Class ExcelUtility | Method setExcelFile | Error Description: "+e.getMessage());
		}
		return excelWBook;
		
	}
	
	public static XSSFSheet setSheet(String sheetName,String path) {
		try {
			excelSheet=ExcelUtility.setExcelFile(path).getSheet(sheetName);
			
		}
		catch(Exception e) {
			Logging.errorMessage("Class ExcelUtility | Method setSheet | Error Description: "+e.getMessage());
		}
		return excelSheet;
		
	}
	
	public static String getCellData(int row, int col,XSSFSheet excelSheet) {
		
		return excelSheet.getRow(row).getCell(col).getStringCellValue();
	}
	
	public static void setCellData(int row, int col,String data,XSSFSheet excelSheet) {
		try {
			if(ExcelUtility.getCellData(row, col, excelSheet)=="") {
				excelSheet.getRow(row).createCell(col).setCellValue(data);
			}
			else {
				excelSheet.getRow(row).getCell(col).setCellValue(data);
			}
			FileOutputStream fileOut = new FileOutputStream(excelPath);
			 
			excelWBook.write(fileOut);
			fileOut.close();

		}
		catch(Exception e) {
			Logging.errorMessage("Class ExcelUtility | Method setCellData | Error Description: "+e.getMessage());
		}
	}

}
