package listenerPractice;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listenerPractice.ListenerImplementation.class)
public class TestClass extends BaseClass {

	@Test
	public void tc() {
		System.out.println("@Test");
		Assert.fail();
	}
	
	@Test(dependsOnMethods = "tc")
	public void tc2() {
		System.out.println("@Test 2");
	}
}
