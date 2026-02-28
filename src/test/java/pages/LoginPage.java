package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	
WebDriver driver;
	
	WebDriverWait wait;
	
	
	//https://www.flipkart.com/
	
	
	
	//page Factory Locators
	
	@FindBy(xpath="//*[@placeholder='Username']")
	WebElement username;
	
	@FindBy(xpath="//*[@placeholder='Password']")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement loginButton;
	
	
	
	@FindBy(xpath="//*[text()='Swag Labs']")
	WebElement swagLabs_title;
	
	public LoginPage(WebDriver driver){
		
		this.driver=driver;
		this.wait=new WebDriverWait(driver,Duration.ofMillis(100));
		
		PageFactory.initElements(driver, this); //initialize elements
		
		//WebDriverWait w=new WebDriverWait(driver,Duration.ofMillis(10));
	}
		
	
	//enter username and password
		public void enterCredentials(String user , String pass)
		{
			
			wait.until(ExpectedConditions.visibilityOf(username));
			username.sendKeys(user);
			
			password.sendKeys(pass);
		}
		
	//click on login button	
		
		public void clickLogin()
		{
			
			loginButton.click();
		}
		
	
	
	
	
	
	
}
