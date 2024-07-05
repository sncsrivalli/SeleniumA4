package testng;

import org.testng.annotations.Test;

public class EnabledFlagTest {

	@Test(invocationCount = 0)
	public void demo1() {
		System.out.println("demo1");
	}
	
	@Test(enabled = false)
	public void demo2() {
		System.out.println("demo2");
	}
	
	@Test(invocationCount = -1)
	public void demo3() {
		System.out.println("demo3");
	}
}
