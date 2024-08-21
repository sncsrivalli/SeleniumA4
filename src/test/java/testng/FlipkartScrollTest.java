package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FlipkartScrollTest {

	@Test
	public void scrollTillElement() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement topDealsOnElectronics = driver.findElement(By.xpath("//div[text()='Top Deals on Electronics']"));
//		Actions actions = new Actions(driver);
//		actions.scrollToElement(topDealsOnElectronics).perform();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", topDealsOnElectronics);
		Thread.sleep(3000);
		driver.quit();
	}
}
