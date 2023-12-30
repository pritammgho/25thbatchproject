package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObject {
	
	public static WebDriver driver;
	
	private By firstName = By.xpath("//input[@name='UserFirstName']");
	
	
	public SignUpPageObject(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver2;
	}


	public WebElement enterFirstName() {
		
		return driver.findElement(firstName);
		
	}

}
