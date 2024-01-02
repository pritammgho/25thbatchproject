package testCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingExcel2 {

	@Test
	
	public void excelhandling() throws IOException, InterruptedException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\HP-PC\\Desktop\\handling excel sheet2.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		XSSFRow row = sheet.getRow(0);
		
		XSSFCell cell = row.getCell(0);
		
		XSSFCell cell2 = row.getCell(1);
		
		System.out.println(sheet.getRow(0).getCell(0));
		
		System.out.println(sheet.getRow(0).getCell(1));
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://login.salesforce.com/?locale=in");
		
		d.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement UN = d.findElement(By.xpath("//input[@name='username']"));
		
		WebElement PW = d.findElement(By.xpath("//input[@id='password']"));
		
		UN.sendKeys(cell.getStringCellValue());
		
		PW.sendKeys(cell2.getStringCellValue());
	}
}
