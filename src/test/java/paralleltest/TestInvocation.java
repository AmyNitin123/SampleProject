package paralleltest;

import org.testng.annotations.Test;

public class TestInvocation extends BaseTest {
	
	
	
	@Test(invocationCount=5,threadPoolSize=5)
	public void executeTest() {
		
		wd=getDriver("chrome");
		
		wd.get("http://google.com");
		
		System.out.println(wd.getTitle());
		
		wd.quit();
	}

}
