package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class LoginTest {

	WebDriver driver;
	LoginPage loginpage;
	
	
	@BeforeTest
	public void setUp() 
	{
		
		//set path to your chrome driver
		// Setup Chrome driver automatically
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
		 //maximize the window		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.saucedemo.com/");
		 
		 
		 
		 String expectedTitle = "Swag Labs";
	        String actualTitle = driver.getTitle();
		// Assert that the actual title matches the expected title
	        Assert.assertEquals(actualTitle, expectedTitle, "Page title mismatch");
		
	}
	
	//login swag labs with username and password credntials 
	
	@Test
	public void testSuccessfullLogin() {
		loginpage.enterCredentials("standard_user", "secret_sauce");
		loginpage.clickLogin();
		
		

        // Assert that the actual title matches the expected title
       //s Assert.assertEquals(actualTitle, expectedTitle, "Page title mismatch");

        // If the assertion above fails, the test stops here.

        // Example of another assertion: Check if an element is displayed
        // WebElement element = driver.findElement(By.tagName("h1")); 
        // Assert.assertTrue(element.isDisplayed(), "H1 element not displayed");	
		
	}
	
	
	
	//close the driver
	
	@AfterTest
	public void teardown()
	{
		if(driver!=null)
		{
			driver.quit();
		}
	}
	
	
	 
	 
	 
	 
	
}
