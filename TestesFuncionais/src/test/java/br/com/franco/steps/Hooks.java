package br.com.franco.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import br.com.franco.driver.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	// resetando dados salvos na conta antes de cada execução, assim a conta não
	// fica sobrecarregada.
	@Before
	public static void resetAplicacao() {

		Driver.getDriver().get("https://seubarriga.wcaquino.me/login");
		Driver.getDriver().findElement(By.id("email")).sendKeys("testesfranco@testes.com");
		Driver.getDriver().findElement(By.id("senha")).sendKeys("testes1234");
		Driver.getDriver().findElement(By.tagName("button")).click();
		Driver.getDriver().findElement(By.linkText("reset")).click();
		String msg = Driver.getDriver().findElement(By.xpath("//div[@class='alert alert-success']")).getText();
		assertEquals("Dados resetados com sucesso!", msg);
		Driver.finalizaDriver();
	}

	// Configurando para capturar screenshot antes de fechar o browser.
	@After(order = 1)
	public void screenshot(Scenario scenario) {

		File file = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("target/screenshots/" + scenario.getName() + ".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//será executado após o (order =1)
	@After(order = 0)
	public void fechaBrowser() {
		// último after a ser executado;
		Driver.finalizaDriver();
	}

}
