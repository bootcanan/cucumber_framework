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

features = "src/test/resources/features",
glue = "stepdefinitions",
        tags = "@wip",
     dryRun=false



)
public class Runner {


}
