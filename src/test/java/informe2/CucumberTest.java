package informe2;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "informe2.steps",
    plugin = {
        "pretty",
        "html:target/cucumber-report.html"
    }
)
public class CucumberTest {
}