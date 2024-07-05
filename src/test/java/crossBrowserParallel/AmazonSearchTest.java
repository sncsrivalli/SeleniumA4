package crossBrowserParallel;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AmazonSearchTest extends BaseClass {

	@Test
	public void searchTest() {
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("soft toys");
		driver.findElement(By.id("nav-search-submit-button")).click();
	}
}
