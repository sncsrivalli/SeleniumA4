package groupexecution;

import org.testng.annotations.Test;

public class TestClass1 {

	@Test(groups = "smoke")
	public void demo1() {
		System.out.println("TestClass1 - demo1 - smoke");
	}
	
	@Test(groups = "sanity")
	public void demo2() {
		System.out.println("TestClass1 - demo2 - sanity");
	}
	
	@Test(groups = "regression")
	public void demo3() {
		System.out.println("TestClass1 - demo3 - regression");
	}
}
