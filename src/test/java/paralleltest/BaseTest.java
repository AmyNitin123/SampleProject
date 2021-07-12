package paralleltest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver wd;

	

	public WebDriver getDriver(String browser) {

		if (browser.equals("chrome")) {

			WebDriverManager.chromedriver().setup();

			wd = new ChromeDriver();
		} else if (browser.equals("firefox")) {

			WebDriverManager.firefoxdriver().setup();

			wd = new FirefoxDriver();

		}

		return wd;

	}
	
	
	@AfterSuite
	public void tearDown() {
		
		wd.quit();
	}
}
