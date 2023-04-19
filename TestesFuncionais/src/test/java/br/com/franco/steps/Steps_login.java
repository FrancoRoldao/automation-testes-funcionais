package br.com.franco.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;

import br.com.franco.driver.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import br.com.franco.utils.UtilsData;
import static br.com.franco.utils.UtilsData.getData;
public class Steps_login {
	
	UtilsData dt = new UtilsData();

	@Given("que acesso a pagina de login")
	public void que_acesso_a_pagina_de_login() {

		Driver.getDriver().get("https://seubarriga.wcaquino.me/login");

	}

	@Given("preencho o campo senha")
	public void preenchoOCampoSenha(io.cucumber.datatable.DataTable dataTable) {
	   
		Driver.getDriver().findElement(By.id("senha")).sendKeys(UtilsData.getData(dataTable, "senha"));
	    //throw new io.cucumber.java.PendingException();
	}

	@When("eu clicar em entrar")
	public void eu_clicar_em_entrar() {

		Driver.getDriver().findElement(By.tagName("button")).click();
	}

	@Then("será exibida a mensagem de erro")
	public void seráExibidaAMensagemDeErro(io.cucumber.datatable.DataTable dataTable) {
	    
		String msgErro = Driver.getDriver().findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
		assertEquals(msgErro, getData(dataTable, "mensagem"));
	   
	}

	@Then("será exibida a mensagem de sucesso {string}")
	public void será_exibida_a_mensagem_de_sucesso(String string) {

		String msgSucesso = Driver.getDriver().findElement(By.xpath("//div[@class='alert alert-success']")).getText();
		assertEquals(msgSucesso, string);
	}
	
	@Then("será exibida a mensagem de sucesso")
	public void seráExibidaAMensagemDeSucesso(io.cucumber.datatable.DataTable dataTable) {
	    
		String msgSucesso = Driver.getDriver().findElement(By.xpath("//div[@class='alert alert-success']")).getText();
		assertEquals(msgSucesso, getData(dataTable, "mensagem"));
	    
	}

	@Given("preencho o campo email")
	public void preenchoOCampoEmail(io.cucumber.datatable.DataTable dataTable) {
	    
		Driver.getDriver().findElement(By.id("email")).sendKeys(getData(dataTable, "email"));
	    
	}

}
