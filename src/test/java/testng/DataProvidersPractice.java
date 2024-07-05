package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidersPractice {

	@Test(dataProvider = "data")
	public void bookTicket(String from, String to) {
		System.out.println("From: " + from + "\tTo: " + to);
	}
	
	@DataProvider
	public Object[][] data() {
		Object[][] obj = new Object[3][2];
		obj[0][0] = "Hyd";
		obj[0][1] = "Chennai";
		
		obj[1][0] = "Hyd";
		obj[1][1] = "Bangalore";
		
		obj[2][0] = "Hyd";
		obj[2][1] = "Delhi";
		
		return obj;
	}
}
