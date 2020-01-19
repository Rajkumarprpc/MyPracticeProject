package TestRunnerP;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="./src/test/java/featureFiles",glue= {"stepDefinition"},dryRun=true)
public class MyTestRunner {

}
