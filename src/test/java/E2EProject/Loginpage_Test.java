package E2EProject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;


public class Loginpage_Test extends Base {
	
	WebDriver driver;
	
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = driverinitialization();
		driver.get(prop.getProperty("url"));
	}

	@Test(dataProvider="getData")
	
	public void verfyloginsuccess(String username, String password) throws Exception
	{	
		LandingPage L = new LandingPage(driver);
		if(L.popupsize().size()>0)
		{
			L.popup().click();
			L.signclick().click();
		LoginPage LP = new LoginPage(driver);
		
		LP.getemail().sendKeys(username);
		LP.getpassword().sendKeys(password);
		LP.getlogin().click();
		}	
		//Log.info(text);

		/*ForgotPassword FP = new ForgotPassword();
		FP.FP().click();
		FP.enteremail().sendKeys("Test@gmail.com");
		FP.instruction().click();*/
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object [][] data = new  Object [2][2];
		
		//pass 0th row
		data [0][0] = "nonuser@gmail.com";
		data [0][1] = "Test123";
		
		//pass 1st row
		data [1][0] = "Amol.chakre015@gmail.com";
		data [1][1] = "Amol@1774$";
		
		return data;
	}

}
