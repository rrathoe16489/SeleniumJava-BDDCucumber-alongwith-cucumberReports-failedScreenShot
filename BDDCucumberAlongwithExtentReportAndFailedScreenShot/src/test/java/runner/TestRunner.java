package runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/**
 * @authorID Rat105478
 * @authorName RameshRathod
 */

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/features/"},
		glue = {"com/wipro/qa/stepDefinitions"},
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "json:target/cucumber-report.json"})

public class TestRunner {
	
	
	
}
