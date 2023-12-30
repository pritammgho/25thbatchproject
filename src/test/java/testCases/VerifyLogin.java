package testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjectModel.LoginPageObject;
import resources.BaseClass;

public class VerifyLogin extends BaseClass {
	
	@Test 
	
	public void VerifyLogin() throws IOException, InterruptedException {
		
		driverInitialize();
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		Thread.sleep(2000);
		
		/*driver.findElement(By.xpath("//input[@id='username']")).sendKeys("pooopooo");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='pw']")).sendKeys("kookoo");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		Thread.sleep(1000); */
		
		LoginPageObject obj = new LoginPageObject(driver);
		
		obj.enterUsername().sendKeys("pg@gmail.com");
		
		Thread.sleep(1000);
		
		obj.enterPassword().sendKeys("prit@123");
		
		Thread.sleep(1000);
		
		obj.clickLogin().click();
		
	}

}
