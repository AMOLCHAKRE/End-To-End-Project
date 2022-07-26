package amazonPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PrimeMembershipPaidPageObjects {
	WebDriver driver;
	By monthly = By.xpath("//span[text()='₹179 per month']");
	
	
	public PrimeMembershipPaidPageObjects(WebDriver driver)
	{
	this.driver= driver;
	}
	
	public boolean getpaidprime()
	{
		WebElement primemoney=driver.findElement(monthly);
		
		return false;
		
	}

}
