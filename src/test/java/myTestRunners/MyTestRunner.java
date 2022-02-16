package myTestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/features/SearchPosts.feature"},
		glue = {"stepDefinitions"},
		plugin = {"pretty",
//				  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				  "timeline:test-output-thread/",
				  "html:target/cucumber-report",
				  "json:target/cucumber.json"				  
//		monochrome = {true},
				}
		)

public class MyTestRunner {

}