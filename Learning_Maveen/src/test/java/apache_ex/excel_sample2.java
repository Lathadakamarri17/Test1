package apache_ex;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel_sample2 {
		public static void main(String[] args) throws IOException {
		//String prjpath = System.getProperty("user.dir");
		
		FileInputStream fis = new FileInputStream("/home/labuser/Desktop/latha.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook (fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		 
		System.out.println(sheet.getLastRowNum());
		System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
		
		sheet.getRow(5).createCell(2).setCellValue("Fail");
		
		FileOutputStream fout = new FileOutputStream("/home/labuser/Desktop/latha.xlsx");
				wb.write(fout);
		wb.close();

	}


}
