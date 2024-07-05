package annotations;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FlipkartTest extends BaseClass1 {

	@Test
	public void addToCartTest() {
		driver.findElement(By.name("q")).sendKeys("iphones");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[contains(text(), '15 (Black, 128 GB)')]")).click();
		
		Set<String> windowIDs = driver.getWindowHandles();
		String parentID = driver.getWindowHandle();
		
		for (String id : windowIDs) {
			driver.switchTo().window(id);
		}
		
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		driver.close();
		
		driver.switchTo().window(parentID);
		driver.findElement(By.xpath("//*[name()='svg' and @class='GAbRIN']")).click();
		
		String header =driver.findElement(By.xpath("//a[@class='T2CNXf QqLTQ-']")).getText();
		if(header.contains("15 (Black, 128 GB)"))
			System.out.println("Test Pass");
		else
			System.out.println("Test Fail");
	}
}
