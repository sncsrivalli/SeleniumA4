package check;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchBrowsersTest {
	
	@Test
	public void lauchBrowser() throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
		WebDriver driver1 = new ChromeDriver();
		
		WebDriver driver2 = new FirefoxDriver();
		
		WebDriver driver3 = new EdgeDriver();
		
		Thread.sleep(4000);
		
		driver1.close();
		driver2.close();
		driver3.close();
	}

}
