package E2EProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class WebTitle_Test extends Base {
	

public static Logger log = LogManager.getLogger(Base.class.getName());
	WebDriver driver;
	LoginPage title;
	LandingPage LandPage;
	@BeforeTest
	public void initilize() throws IOException
	{
		driver = driverinitialization();
		driver.get(prop.getProperty("url"));
		
	}
	
	@Test
	public void TitleTest () throws IOException
	{
		LandPage = new LandingPage(driver);
		if(LandPage.popupsize().size()>0)
		{
			LandPage.popup().click();
		}
		
		//title = new LoginPage(driver);
		LandPage.gettitle().getText();
		Assert.assertEquals(LandPage.gettitle().getText(), "WebServices Testing using SoapUI");
		log.info("Title validated successfully");
	}
		
	@Test
	public void navigationbar()
	{
		LandPage.getoptions().click();
		Assert.assertFalse(LandPage.getnavbars().isDisplayed());
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}

}
