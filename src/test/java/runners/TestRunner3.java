package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/*
 This will run the feature class
@RunWith is used to run the java class

features:points to the path of the features folder

glue:points the path of the step definitions folder

tag:which feature files to run.




*/
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target\\cucumber-report-reservation5.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},

        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@room_reservation or @yandex",
        dryRun=false



)

public class TestRunner3 {


}
