
package testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/*import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
*/
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/functionalTest",
        glue = {"stepdefinition"},
        dryRun = false,
        monochrome = false,
         plugin = {"pretty","json:TestReports/cucumber.json","junit:TestReports/cucumber.xml"}
       // plugin = {"html:TestReports", "json:TestReports/cucumber.json", "junit:TestReports/cucumber.xml"}


        //mvn test -Dcucumber.options="--tags 'amazonCheckout'"

)
public class TestRunner {
}