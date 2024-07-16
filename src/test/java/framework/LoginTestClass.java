package framework;

import org.testng.annotations.Test;

public class LoginTestClass extends BaseClass {

	@Test
	public void loginTest() {
		login.setUsername(fileUtil.read("username"));
		login.setPassword(fileUtil.read("password"));
		login.clickKeepMeLoggedInCB();
		login.clickLoginBTN();		
	}
}
