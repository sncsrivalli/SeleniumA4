package crossBrowserParallel;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FlipkartSearchTest extends BaseClass {

	@Test
	public void searchTest() {
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("laptops");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
