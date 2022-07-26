package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	WebDriver driver;
	
	By popup = By.xpath("//button[text()='NO THANKS']");
	By signclick = By.xpath("//span[text()='Login']");
	By title = By.cssSelector(".navbar-brand");
	By options = By.cssSelector(".img-responsive");
	//.link-below-button
	By navbars = By.cssSelector(".img-responsive");
	//[id='navbarNav']
	
	


public LandingPage (WebDriver driver) {
	
	this.driver = driver;
}

public List<WebElement> popupsize() {
	return driver.findElements(popup);
}

public WebElement popup() {
	return driver.findElement(popup);
}

public WebElement signclick() {
	return driver.findElement(signclick);
}

public WebElement gettitle ()
{
	return driver.findElement(title);
}

public WebElement getoptions ()
{
	return driver.findElement(options);
}

public WebElement getnavbars ()
{
	return driver.findElement(navbars);
}

}
