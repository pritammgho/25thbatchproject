package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	
		public WebDriver driver;

		private By username = By.xpath("//input[@id='username']");
		
		private By password = By.xpath("//input[@name='pw']");
		
		private By login = By.xpath("//input[@value='Log In']");
		
		
		
		public LoginPageObject(WebDriver driver2) {
			// TODO Auto-generated constructor stub
			this.driver=driver2;
		}

		public WebElement enterUsername() {
		
			return driver.findElement(username);
			
			
		}
		
		public WebElement enterPassword() {
			
			return driver.findElement(password);
			
			
		}
		
		public WebElement clickLogin() {
			
			return driver.findElement(login);
			
			
		}
	
}
