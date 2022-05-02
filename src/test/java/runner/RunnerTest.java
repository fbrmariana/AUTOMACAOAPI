package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/features"},
		tags = "@usuario",
		glue = "steps",
		monochrome = true,
		plugin = {},
		snippets = SnippetType.CAMELCASE
			
		
		)



public class RunnerTest {

}
