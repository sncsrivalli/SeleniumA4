package groupexecution;

import org.testng.annotations.Test;

public class TestClass3 {

	@Test(groups = "regression")
	public void demo1() {
		System.out.println("TestClass3 - demo1 - regression");
	}
	
	@Test(groups = "sanity")
	public void demo2() {
		System.out.println("TestClass3 - demo2 - sanity");
	}
	
	@Test(groups = {"regression", "sanity"})
	public void demo3() {
		System.out.println("TestClass3 - demo3 - sanity and regression");
	}
}
