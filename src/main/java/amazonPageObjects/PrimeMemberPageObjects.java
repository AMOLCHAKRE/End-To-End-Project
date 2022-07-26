package amazonPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PrimeMemberPageObjects {
	
	WebDriver driver;
	
	By prime = By.id("nav-link-prime");  ////*[@id='nav-link-prime'or @id='nav-link-amazonprime']
	By benefitsofprime = By.id("multiasins-img-link");
	By joinprime = By.id("a-autoid-0");
	By enteremail = By.id("ap_email");
	By submit = By.xpath("//*[@type='submit']");
	By password = By.id("ap_password");
	By signin = By.className("a-button-input");
	
	
	
	public PrimeMemberPageObjects(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void getPrime() 
	{
		driver.findElement(prime).click();
		/*WebElement primes = driver.findElement(prime);
		Actions action = new Actions(driver);
		action.moveToElement(primes).perform();*/
		
	}
	
	public void getPrimebenefits() 
	{
		
		//driver.findElement(benefitsofprime).click();
		
	}
	
	public void getprimemembership()
	{
		driver.findElement(joinprime).click();
	}
	
	public void getemailforprime()
	{
		driver.findElement(enteremail).sendKeys("amol.chakre015@gmail.com");
	}
	
	public void getcontinue()
	{
		driver.findElement(submit).click();
	}
	
	public void getpassword ()
	{
		driver.findElement(password).sendKeys("Amol@1774");
	}
	
	public void getsignin ()
	{
		driver.findElement(signin).click();
	}
}
