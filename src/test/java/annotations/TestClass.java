package annotations;

import org.testng.annotations.Test;

public class TestClass extends BaseClass {

	@Test
	public void tc() {
		System.out.println("@Test");
	}
}
