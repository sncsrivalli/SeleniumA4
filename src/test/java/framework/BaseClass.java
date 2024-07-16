package framework;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pom.LoginPage;

public class BaseClass {

	protected WebDriver driver;
	protected LoginPage login;
	protected FileUtility fileUtil;
	protected DriverUtility driverUtil;
	JavaUtility jutil;
	
	@BeforeClass
	public void classSetup() {
		fileUtil = new FileUtility();
		driverUtil = new DriverUtility();
		jutil = new JavaUtility();
		
		driver = driverUtil.launchBrowser();
		driverUtil.maximizeBrowser();
		driverUtil.waitTillElementFound(jutil.convertStringToLong(fileUtil.read("timeouts")));
	}
	
	@BeforeMethod
	public void methodSetup() {
		driverUtil.navigateToApp(fileUtil.read("url"));
		login = new LoginPage(driver);
	}
	
	@AfterClass
	public void classTeardown() {
		driverUtil.exitBrowser();
	}
}
