package parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParameterization {
	
	
	
	@Test(dataProvider="getData")
	public void doLogin(String username,String pwd) {
		
		System.out.println("username: "+username);
		System.out.println("Password: "+pwd);
		
	}
	
	
	
	@DataProvider	
	public Object[][] getData() {
		
		
		
		Object[][] data=new Object[3][2];
		
		data[0][0]="amy";
		data[0][1]="abc";
		
		data[1][0]="nithin";
		data[1][1]="abc";
		
		data[2][0]="ahaana";
		data[2][1]="abc";

		
		
		return data;
	}
	

}
