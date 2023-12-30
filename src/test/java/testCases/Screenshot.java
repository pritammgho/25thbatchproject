package testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshot {
	
	
	@Test
	
	public void capturingScrnshot() throws InterruptedException, IOException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.browserstack.com/guide/wait-commands-in-selenium-webdriver");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		TakesScreenshot srcShot = (TakesScreenshot)driver;
		
		File source = srcShot.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\HP-PC\\Desktop\\Screenshot\\sc.png");
		
		FileUtils.copyFile(source, destination);
		
		System.out.println("SS captured");
		
		driver.close();
		
		
		
	}

}
