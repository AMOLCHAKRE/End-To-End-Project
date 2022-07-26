package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class LoginstepDefination extends Base {

    @Given("^Initialize the browser with chrome$")
    public void initialize_the_browser_with_chrome() throws Throwable {
    	
    	driver = driverinitialization();
      
    }
    
    @And("^navigate to \"([^\"]*)\" site$")
    public void navigate_to_something_site(String strArg1) throws Throwable {
    	driver.get(prop.getProperty("url"));
        
    }
    
    @And("^click on login button present on landing page$")
    public void click_on_login_button_present_on_landing_page() throws Throwable {
    	
    	LandingPage L = new LandingPage(driver);
		if(L.popupsize().size()>0)
		{
			L.popup().click();
			L.signclick().click();
		}
    }

    @When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_something_and_something(String strArg1, String strArg2) throws Throwable {
    	
LoginPage LP = new LoginPage(driver);
		
		LP.getemail().sendKeys(strArg1);
		LP.getpassword().sendKeys(strArg2);
		LP.getlogin().click();
       
    }

    @Then("^Navigated to the home page and user logged sucessfully$")
    public void navigated_to_the_home_page_and_user_logged_sucessfully() throws Throwable {
    	
    	// Write Search filed code present on home page
   
    }

}