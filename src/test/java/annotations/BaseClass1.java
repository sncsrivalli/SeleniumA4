package annotations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass1 {
	WebDriver driver;
	//@BeforeSuite
	//@BeforeTest
	
	@BeforeClass
	public void classConfiguration() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@BeforeMethod
	public void methodSetup() {
		driver.get("https://www.flipkart.com/");
	}
	
	@AfterMethod
	public void methodTeardown() {
		System.out.println("Test Execution completed");
	}
	
	@AfterClass
	public void classTeardown() {
		driver.quit();
	}
	
	//@AfterTest
	//@AfterSuite
}
