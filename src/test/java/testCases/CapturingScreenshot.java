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

public class CapturingScreenshot {

	
	@Test
	
	public void capturingScreenshot() throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement FBlogo = driver.findElement(By.xpath("//img[@src='https://static.xx.fbcdn.net/rsrc.php/y1/r/4lCu2zih0ca.svg']"));
		
		TakesScreenshot srcShot =(TakesScreenshot)FBlogo;
		
		File source = srcShot.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\HP-PC\\Desktop\\Screenshot\\SS4.png");
		
		FileUtils.copyFile(source, destination);
		
		System.out.println("ScreenShot captured");
		
		
		
		
		
	}
}
