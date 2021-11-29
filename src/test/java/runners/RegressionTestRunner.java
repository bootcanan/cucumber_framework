package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target\\cucumber-report-reservation7.html",
                "json:target/json-reports/cucumber7.json",
                "junit:target/xml-report/cucumber7.xml"},

        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@regression",
        dryRun=false



)
public class RegressionTestRunner {
}
