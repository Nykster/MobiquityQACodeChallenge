package myTestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/features/FetchCommentsValidateEmail.feature"},
		glue = {"stepDefinitions"},
		plugin = {"pretty",
				  "timeline:test-output-thread/",
				  "html:target/cucumber-report",
				  "json:target/cucumber.json"				  
				}
		)

public class MyTestRunner {

}