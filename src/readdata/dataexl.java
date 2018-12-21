package readdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class dataexl 
{
	@Test
public void exlread() throws IOException
{
	File ff = new File("D:\\Selenium\\readdata\\data\\EXLFILE.xlsx");	
	FileInputStream fi = new FileInputStream(ff);
	XSSFWorkbook workbook = new XSSFWorkbook(fi);
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	XSSFCell cell = sheet.getRow(0).getCell(0);
	String celldata = cell.getStringCellValue();
	System.out.println(celldata);
	}
}
