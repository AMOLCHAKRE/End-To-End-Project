package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
	static ExtentReports extent;
	ExtentTest test;
	static String basepath = System.getProperty("user.dir");
	
	public static ExtentReports  getReportObj () {
		
		String path = basepath + "\\Reports\\index.html";
		ExtentSparkReporter report = new ExtentSparkReporter(path);
		report.config().setReportName("E2EProject");
		report.config().setDocumentTitle("Test Results");

		extent = new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("Automation QA", "Amol Chakre");
		extent.createTest("E2E Test")
		.log(Status.PASS, "First E2E Test");
		return extent;
	
	}
	
	/*@Test
	public void logintest() {
		
	test = extent.createTest("loginresultest");
	test.info("Test is done");
	test.log(Status.PASS, "Test is passed");
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.extentreports.com/docs/versions/5/java/index.html");
	System.out.println(driver.getTitle());
	driver.close();
	extent.flush();*/
	
	
	
	}


