package test.testprjct;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMethods {
	public String excelPath ="C:\\Users\\Lenovo\\Desktop\\Book1.xls";
	Workbook wb = null;
	String fileExtn = null;
	File file = new File(excelPath);
public void setUp(){
	/*WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);*/
	System.out.println("sdjfch");
}
public static void main (String[] args) throws IOException{
	TestMethods t = new TestMethods();
	//t.readFromExcel("Sheet1");
	t.WriteFromExcel("Sheet1", "sonkar");
}
public String readFromExcel(String SheetName) throws IOException{
	
	FileInputStream fis = new FileInputStream(file);
	fileExtn = excelPath.substring(excelPath.indexOf("."));
	
	if(fileExtn.equals(".xlsx")){
		//wb = new XSSFWorkbook(fis);
	}else if(fileExtn.equals(".xls")){
		wb = new HSSFWorkbook(fis);
	}
	Sheet s1 = wb.getSheet(SheetName);
	int rowCount = s1.getLastRowNum()-s1.getFirstRowNum();
	System.out.println(rowCount);
	String s = null ;
	for(int i=0;i<=rowCount+1;i++){
		Row row = s1.getRow(i);
		for(int j =0;j<row.getLastCellNum();j++){
			 s =row.getCell(j).getStringCellValue();
			
			System.out.println(s);
		}
	}
	return s;
} 
public String WriteFromExcel(String SheetName, String data) throws IOException{
	
	FileInputStream fis = new FileInputStream(file);
	fileExtn = excelPath.substring(excelPath.indexOf("."));
	
	if(fileExtn.equals(".xlsx")){
		//wb = new XSSFWorkbook(fis);
	}else if(fileExtn.equals(".xls")){
		wb = new HSSFWorkbook(fis);
	}
	Sheet s1 = wb.getSheet(SheetName);
	int rowCount = s1.getLastRowNum()-s1.getFirstRowNum();
	String s = null ;
	//to get first row 
	Row row = s1.getRow(0);
	// to create new row and append it in the last
	Row newRow = s1.createRow(rowCount+1);
System.out.println(row.getLastCellNum());	
	
		for(int j =0;j<=row.getLastCellNum();j++){
			Cell c1 = newRow.createCell(j);
			c1.setCellValue(data);
		}
		//close input stream
	fis.close();
	FileOutputStream fos = new FileOutputStream(excelPath);
	wb.write(fos);
	fos.close();
	
	return s;
	
} 
}
