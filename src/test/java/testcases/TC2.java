package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC2 {
	
	
	
	@Test
	public void validateTitles() {
		
		
		String expectedTitle="Yahoo.com"; //excel
		String actualTitle="Gmail.com";  //from selenium
		
		
		SoftAssert softassert=new SoftAssert();
		
		
		softassert.assertEquals(actualTitle, expectedTitle);
		
		softassert.fail("Failing the test as the condition is not met");
				
		softassert.assertEquals(false, "Element is not present");
				

		softassert.assertAll();
		
		//Assert.assertEquals(actualTitle, expectedTitle);
		
		//Assert.fail("Failing the test as the condition is not met");
		
		//Assert.assertEquals(false, "Element is not present");
		
		
		
	}

}
