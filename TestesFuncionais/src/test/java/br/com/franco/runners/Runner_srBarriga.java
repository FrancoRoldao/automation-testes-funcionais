package br.com.franco.runners;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.AfterAll;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/srBarriga/login.feature",
		glue = "br.com.franco.steps",
        plugin = {"pretty", "html:target/report-html", "json:target/report.json" },
        publish = false,
		stepNotifications = true,
		dryRun = false,
		snippets = io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE
		
		)
public class Runner_srBarriga {
	
	
	

}
