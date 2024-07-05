package assertions;

import org.testng.annotations.Test;

public class WhyNotIfElse {

	@Test
	public void test1() {
		String s1 = "Hello";
		String s2 = "hello";
		
		if(s1.equals(s2))
			System.out.println("Test Pass");
		else
			System.out.println("Test Fail");
	}
}
