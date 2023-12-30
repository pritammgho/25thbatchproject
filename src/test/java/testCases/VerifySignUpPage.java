package testCases;

import java.io.IOException;
import java.sql.Driver;

import org.testng.annotations.Test;

import pageObjectModel.SignUpPageObject;
import resources.BaseClass;

public class VerifySignUpPage extends BaseClass {
	
	@Test
	
	public void VerifySignUp() throws IOException, InterruptedException {
		
		driverInitialize();
		
		Thread.sleep(1000);
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		
		Thread.sleep(1000);
		
		SignUpPageObject SPO = new SignUpPageObject(driver);
		
		SPO.enterFirstName().sendKeys("ABCTXYZ");
		
	}

}
