package core;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue={"steps"},
        format = {"json:target/cucumber.json"},
        monochrome = true
)
public class testRunner {

}
