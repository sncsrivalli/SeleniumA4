package groupexecution;

import org.testng.annotations.Test;

public class TestClass2 {

	@Test(groups = "smoke")
	public void demo1() {
		System.out.println("TestClass2 - demo1 - smoke");
	}
	
	@Test(groups = "regression")
	public void demo2() {
		System.out.println("TestClass2 - demo2 - regression");
	}
	
	@Test(groups = {"smoke", "regression"})
	public void demo3() {
		System.out.println("TestClass2 - demo3 - smoke and regression");
	}
}
