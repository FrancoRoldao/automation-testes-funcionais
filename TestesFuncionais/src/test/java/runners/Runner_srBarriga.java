package runners;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/features/srBarriga/login.feature",
		glue = "steps",
        plugin = {"pretty", },
        publish = false,
		stepNotifications = true,
		dryRun = false,
		snippets = io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE
		
		)
public class Runner_srBarriga {
	
	
	
	

}
