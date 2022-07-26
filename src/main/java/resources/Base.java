package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	public static WebDriver driver;
	public WebDriverWait wait;
	public Properties prop;
	public String basePath = System.getProperty("user.dir");
	
public void clickElementJS (WebElement webElement) throws Exception {
		
		WebElement element = driver.findElement(getElement (webElement));
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
}

	protected By getElement(WebElement webElement) {
	// TODO Auto-generated method stub
	return null;
}

	public WebDriver driverinitialization() throws IOException {
	
		prop = new Properties();
		FileInputStream file = new FileInputStream(
				"C:\\Users\\lenovo\\eclipse-workspace\\E2EProject\\src\\main\\java\\resources\\Data.properties");
		prop.load(file);

		String browsername = prop.getProperty("browser");

		if (browsername.equals("chrome")) {
			// execute chrome browser code

			System.setProperty("webdriver.chrome.driver",
					"D:\\Amol Data\\Selenium Automation\\Drivers\\ChromeDriver\\Updated version\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();

		}

		else if (browsername.equals("firefox"))
				{
			// execute firefox browser code
			driver = new FirefoxDriver();
		} else if (browsername.equals("edge")) {
			// execute edge browser code

			// System.setProperty("webdriver.edge.driver","D:\\Amol Data\\Selenium
			// Automation\\Drivers\\Microsoft Edge\\edgedriver_win32\\msedgedriver.exe");
			driver = new EdgeDriver();
		}

		wait = new WebDriverWait(driver, Duration.ofSeconds(1,120));
		
		return driver;

	}
	
	//public void getScreenshotpath(String TestcaseName, WebDriver driver) throws IOException {
		
		public String getScreenshot(String result) throws IOException{
			/*File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File(basePath+"\\Screenshots\\" +result+ ".png"));*/
			
		
		TakesScreenshot shot = (TakesScreenshot)driver;
		File source =shot.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\Screenshots\\"+result+".png";
		FileUtils.copyFile(source, new File(destinationFile));
		return destinationFile;
		
				
	
	}
}
