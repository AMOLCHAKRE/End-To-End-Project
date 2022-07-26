package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	By email = By.cssSelector("[type='email']");
	By password = By.cssSelector("[id='user_password']");
	By login = By.cssSelector("[name='commit']");
	
	

public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	
	this.driver = driver;
	}
public WebElement getemail()
{
	return driver.findElement(email);
}
	public WebElement getpassword()	
	{
	return driver.findElement(password);
	
	}
	
	public WebElement getlogin ()
	{
		return driver.findElement(login);
	}
	
}
		
	

