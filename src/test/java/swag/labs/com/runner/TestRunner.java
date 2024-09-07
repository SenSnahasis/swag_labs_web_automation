package swag.labs.com.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/featurefile",
        glue = {"swag.labs.com.stepdefinition"},
//        tags = "",
        stepNotifications = true,
        monochrome = true,
        dryRun = false,
        plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json", "junit:target/junit.xml"
        }
)
public class TestRunner {
}
