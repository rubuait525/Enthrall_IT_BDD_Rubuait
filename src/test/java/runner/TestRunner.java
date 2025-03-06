package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		tags = "@smoke or @sanity or @regression or @login",
		features = "src/test/java/feature",
		glue = {"stepDefination", "baseUtil"},
		monochrome = false,
		dryRun = false,
		plugin = {"pretty", "html:target/report.html", "json:target/report.json", "junit:target/report.xml"}
		)
public class TestRunner {

}
