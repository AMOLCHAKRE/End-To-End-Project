package amazonAppValidation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import amazonPageObjects.AmazonLogin;
import resources.Base;

public class AmazonLoginTest extends Base {

	WebDriver driver;

	@BeforeTest

	public void initialize() throws IOException {
		driver = driverinitialization();
		driver.get(prop.getProperty("url3"));
	}

	@Test
	public void getlogin() {
		AmazonLogin login = new AmazonLogin(driver);
		login.shiftloginpage();
		
		login.getsign();
		login.getemail();
		login.getsubmit();
		login.getPassword();
		login.getloggedin();
		System.out.println(driver.findElements(By.tagName("a")).size());
	}

	@AfterTest
	public void teardown() {

		driver.manage().deleteAllCookies();
		driver.close();
	}

}
