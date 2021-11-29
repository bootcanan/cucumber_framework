package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target\\cucumber-report-reservation6.html",
                "json:target/json-reports/cucumber6.json",
                "junit:target/xml-report/cucumber6.xml"},

        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@smoke",
        dryRun=false



)
public class SmokeTestRunner {
}
