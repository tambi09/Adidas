package demoblaze.com.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "demoblaze/com/step_definitions",
        dryRun = true

)

public class CukesRunner {
}
