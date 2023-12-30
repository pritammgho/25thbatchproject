package testCases;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.stream.FileImageInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingExcel {
	
	@Test
	
	public void excelHandling() throws IOException, InterruptedException {
		
		FileInputStream fs = new FileInputStream("C:\\Users\\HP-PC\\Desktop\\Test Data.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		XSSFRow row = sheet.getRow(0);
		
		XSSFCell cell = row.getCell(0);
		
		System.out.println(sheet.getRow(0).getCell(0));
		
		System.out.println(sheet.getRow(0).getCell(1));
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement UN = driver.findElement(By.xpath("//input[@class='input r4 wide mb16 mt8 username']"));
		
		UN.click();
;		UN.sendKeys();
		
		WebElement PW = driver.findElement(By.xpath("//input[@id='password']"));
		
		PW.click();
		PW.sendKeys();
	}
	
	

}
