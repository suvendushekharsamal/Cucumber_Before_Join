package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/java/features",   // or "src/test/resources/features" if you move them
    glue = "stepdefinations",              // must match your package name exactly
    plugin = {
        "pretty",
        "html:target/cucumber-report.html",
        "json:target/cucumber-report.json"
    },
    monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
}