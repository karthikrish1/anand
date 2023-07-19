package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class e1 {
//apache poi, ooxml, ooxml schema
	public static void main(String[] args) throws IOException {
		
		//File
		//FileInput
		
		File f= new File("C:\\Users\\hp\\Desktop\\My Contact Form - Copy 2.xlsx");
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook x= new XSSFWorkbook(fis);
		XSSFSheet sheet = x.getSheetAt(0);
		
		// number of rows
		int row=sheet.getLastRowNum();
		System.out.println("Number of rows "+ row);
		// number of columns: specific about the row number
		int col=sheet.getRow(0).getLastCellNum();
		System.out.println("Number of columns "+ col);
		
		// cell=> read
		XSSFCell data = sheet.getRow(5).getCell(2);
		System.out.println(data);
		
		//13,5
		sheet.getRow(13).createCell(5).setCellValue("hi");
		FileOutputStream fos= new FileOutputStream(f);
		x.write(fos);

	}
}
