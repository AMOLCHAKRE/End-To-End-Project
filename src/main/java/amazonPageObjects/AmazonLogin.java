package amazonPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AmazonLogin {
	WebDriver driver;
	By shiftloginpage = By.id("nav-link-accountList");
	By sign = By.xpath("//*[@id=\'nav-flyout-ya-signin\']/a/span");
	By getemail = By.id("ap_email");
	By continue1 = By.id("continue");
	By submitpassword = By.xpath("//input[@type='password']");
	By loggedin = By.id("signInSubmit");

	public AmazonLogin(WebDriver driver) {
		this.driver = driver;
	}

	public void shiftloginpage()

	{
		WebElement mouseover = driver.findElement(shiftloginpage);
		Actions action = new Actions(driver);
		action.moveToElement(mouseover).perform();
		
	}

	public void getsign() {
		driver.findElement(sign).click();
	}

	public void getemail() {
		driver.findElement(getemail).sendKeys("amol.chakre015@gmail.com");
	}

	public void getsubmit() {
		driver.findElement(continue1).click();
	}

	public void getPassword() {
		driver.findElement(submitpassword).sendKeys("Amol@1774");
	}

	public void getloggedin() {
		driver.findElement(loggedin).click();
	}
}
