package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target\\cucumber-reports5.html",
                "json:target/cucumber-report/cucumber.json"
        },


        features = "src/test/resources/features/db_feature",
        glue = "database_step_definitions",
        tags = "@db_first",
        dryRun=false



)
public class DB_Runner {





}
