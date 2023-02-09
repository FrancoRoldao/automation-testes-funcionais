package br.com.franco.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;

import br.com.franco.driver.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps_login {

	@Given("que acesso a pagina de login")
	public void que_acesso_a_pagina_de_login() {

		Driver.getDriver().get("https://seubarriga.wcaquino.me/login");

	}

	@Given("preencho o campo senha com {string}")
	public void preencho_o_campo_senha_com(String string) {

		Driver.getDriver().findElement(By.id("senha")).sendKeys(string);
	}

	@When("eu clicar em entrar")
	public void eu_clicar_em_entrar() {

		Driver.getDriver().findElement(By.tagName("button")).click();
	}

	@Then("será exibida a mensagem {string}")
	public void será_exibida_a_mensagem_de_erro(String string) {

		String msgErro = Driver.getDriver().findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
		assertEquals(msgErro, string);
	}

	@Then("será exibida a mensagem de sucesso {string}")
	public void será_exibida_a_mensagem_de_sucesso(String string) {

		String msgSucesso = Driver.getDriver().findElement(By.xpath("//div[@class='alert alert-success']")).getText();
		assertEquals(msgSucesso, string);
	}

	@Given("preencho o campo email com {string}")
	public void preencho_o_campo_email_com(String string) {

		Driver.getDriver().findElement(By.id("email")).sendKeys(string);
	}

}
