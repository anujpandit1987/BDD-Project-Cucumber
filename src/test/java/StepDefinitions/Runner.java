package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature",glue= {"StepDefinitions"},
monochrome =true, 
plugin = {"pretty","junit:target/JUnitReports/report.xml"},
tags="@smoketest"
		)
public class Runner {

	
}
