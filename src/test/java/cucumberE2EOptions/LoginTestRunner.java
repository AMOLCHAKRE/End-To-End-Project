package cucumberE2EOptions;

import org.junit.runner.RunWith;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java"},
		glue = {"LoginstepDefination"},
		plugin = {"pretty"}
		)
public class LoginTestRunner extends AbstractTestNGCucumberTests {

}
