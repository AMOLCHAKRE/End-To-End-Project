package amazonAppValidation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import amazonPageObjects.PrimeMemberPageObjects;
import amazonPageObjects.PrimeMembershipPaidPageObjects;
import resources.Base;

public class PrimeMemberTest extends Base {
	WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = driverinitialization();
		driver.get(prop.getProperty("url3"));	
	}
	
	@Test
	public void getprimememberstest() 
	{
		PrimeMemberPageObjects prime = new PrimeMemberPageObjects(driver);
		prime.getPrime();
		prime.getPrimebenefits();
		prime.getprimemembership();
		prime.getemailforprime();
		prime.getcontinue();
		prime.getpassword();
		prime.getsignin();
		
		System.out.println(driver.findElements(By.tagName("a")).size());
	}
	
	@Test
	
	public void getMembership()
	{
		PrimeMembershipPaidPageObjects paidprime = new PrimeMembershipPaidPageObjects(driver);
		System.out.println(paidprime.getpaidprime());
		
	}

}
