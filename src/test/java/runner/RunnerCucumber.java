package runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@CucumberOptions(
        features = "src/test/resources/features"
        ,tags = "@OpenSite"
        ,snippets = CucumberOptions.SnippetType.CAMELCASE
        ,glue = "stepDefinitions"
)
@RunWith(CucumberWithSerenity.class)

public class RunnerCucumber {


}
