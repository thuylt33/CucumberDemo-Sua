package CucumberTest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources\\CucumberTest" },
		// set output to html file
		plugin = { "pretty", "html:target/HtmlReports" },
		// indicate the package contain step definition
		glue = "StepDefinitions",
		// config to readable console
		monochrome = true, dryRun = true)
public class RunCucumberTest {
}