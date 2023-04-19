package br.com.franco.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/adicionarConta.feature",
		glue = "br.com.franco.steps",
        plugin = {"pretty", "html:target/report-html", "json:target/report.json" },
        publish = false,
        tags = "@adicionarConta",
		stepNotifications = true,
		dryRun = false,
		snippets = io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE
		
		)
public class Runner_srBarriga {
	
	
	

}
