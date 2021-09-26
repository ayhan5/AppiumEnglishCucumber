package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/default-cucumber-reports"},
        features="src/test/resources/features",
        glue = "stepdefinitions",
<<<<<<< HEAD
        tags = "@spinner",
=======
        tags = "@reusableScrollMethod",
>>>>>>> 4bdf60b844954d959933ac1051973737d2ab0a27
        dryRun = false
)
public class Runner {
}
