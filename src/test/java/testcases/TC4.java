package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC4 {
	
	
	
	

	@BeforeTest
	public void createDBConnection() {

		System.out.println("Creating DB Connection");

	}

	@AfterTest
	public void closeDBConnection() {

		System.out.println("Closing DB Connection");

	}

	@BeforeMethod
	public void launchBrowser() {

		System.out.println("Launching Browser");
	}

	@AfterMethod
	public void closeBrowser() {

		System.out.println("Closing Browser");
	}

	@Test(priority = 2,dependsOnMethods="doUserRegistration",groups="functional")
	public void doLogin() {

		System.out.println("Executing Login test");
	}

	@Test(priority = 1, groups="functional")
	public void doUserRegistration() {

		System.out.println("Executing User Reg test");
		Assert.fail("User not registered succesfully");
	}
	
	@Test(priority = 3,dependsOnMethods="doUserRegistration",alwaysRun=true, groups="functional")
	public void doLogin2() {

		System.out.println("Login2 test");
		
	}
	@Test(priority = 4, groups="smoke")
	public void doLogin3() {

		System.out.println("Login3 test");
		
	}

	@Test(priority = 5, groups={"smoke","functional"})
	public void doLogin4() {

		System.out.println("Login4 test");
		
	}

}
