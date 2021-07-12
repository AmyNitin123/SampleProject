package paralleltest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
	
	
	
	@Test(priority=1)
	public void doLogin() {
		
		
       wd=getDriver("chrome");
       
       wd.manage().window().maximize();
		
		wd.get("http://gmail.com");
		wd.findElement(By.id("Email")).sendKeys("amruthapb2@gmail.com");
		
		
		
	}

	
	@Test(priority=2)
	public void doReg() {
		
		
       wd=getDriver("chrome");
       
       wd.manage().window().maximize();
		
		wd.get("http://gmail.com");
		wd.findElement(By.id("Email2")).sendKeys("amruthapb2@gmail.com");
		
		
		
	}
}
