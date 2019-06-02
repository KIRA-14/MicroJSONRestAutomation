package kiran.com.rest.base;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(glue= {},
				features= {"./"},
				tags= {"@Test"},
				format= {"pretty","html:Test-OutPut"},
				dryRun=true)

public class TestRunner {

}
