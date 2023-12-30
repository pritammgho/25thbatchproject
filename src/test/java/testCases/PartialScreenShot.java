package testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PartialScreenShot {

	
	@Test
	
	public void capturingPartialSS() throws InterruptedException, IOException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Salesforce']"));
		
		TakesScreenshot scrnShot = (TakesScreenshot)driver;
		
		File source = logo.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\HP-PC\\Desktop\\Screenshot\\abc.png");
		
		FileUtils.copyFile(source, destination);
		
		Thread.sleep(2000);
		
		System.out.println("Logo screenshot captured");
		
	}
}
