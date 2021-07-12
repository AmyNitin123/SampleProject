package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC3 {
	
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

	@Test(priority = 2,dependsOnMethods="doUserRegistration")
	public void doLogin() {

		System.out.println("Executing Login test");
	}

	@Test(priority = 1)
	public void doUserRegistration() {

		System.out.println("Executing User Reg test");
		Assert.fail("User not registered succesfully");
	}
	
	@Test(priority = 3,dependsOnMethods="doUserRegistration",alwaysRun=true)
	public void doLogin2() {

		System.out.println("Login2 test");
		
	}
	@Test(priority = 4)
	public void doLogin3() {

		System.out.println("Login3 test");
		
	}

}
