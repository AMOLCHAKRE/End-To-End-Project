package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword {
	public WebDriver driver;
	
	By Forgotpassword = By.xpath("//a[contains(text(),'Forgot Password?')]");
	By Enteremail = By.id("user_email");
	By Instructions = By.cssSelector("input[type='submit']");
	



public void forgotpassword (WebDriver driver) {
	this.driver = driver;
}

public WebElement FP () {
	return driver.findElement(Forgotpassword);
}

public WebElement enteremail () {
	return driver.findElement(Enteremail);
}

public WebElement instruction() {
	return driver.findElement(Instructions);
}

}