/**
 * 
 */
package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author suman
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions( //monochrome=false,
		plugin = {"pretty","html:target/html-report/login",
				"json:target/cucumber-report/login.json"},
				features = {"src/main/resources/onlineshopping/login.feature"},
				glue= {"com.onlineshopping.steps.impl"},
				tags = {"@LoginTest"}
				//dryRun=false
				)
public class LoginRunnerTest {

}
