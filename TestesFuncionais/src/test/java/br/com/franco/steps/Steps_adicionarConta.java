package br.com.franco.steps;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;

import br.com.franco.driver.Driver;
import br.com.franco.driver.Driver.*;
import br.com.franco.pages.*;
import br.com.franco.utils.Massa;
import br.com.franco.utils.UtilsData;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps_adicionarConta {
	
	UtilsData dt = new UtilsData();
	

	@Given("que estou logado na aplicação")
	public void queEstouLogadoNaAplicação() {

		PageBase.getPage();
		PageBase.loginPadrao();
	}

	@Given("visualizo a pagina inicial")
	public void visualizoAPaginaInicial() {

		String msg = Driver.getDriver().findElement(By.xpath("//div[@class='alert alert-success']")).getText();
		assertEquals("Bem vindo, TestesFuncionais!", msg);
	}

	@Given("seleciono contas")
	public void selecionoContas() {

		Driver.getDriver().findElement(By.linkText("Contas")).click();

	}

	@Given("seleciono adicionar")
	public void selecionoAdicionar() {

		Driver.getDriver().findElement(By.linkText("Adicionar")).click();
	}

	@When("informo a conta")
	public void informoAConta() {
	    
		
		Driver.getDriver().findElement(By.id("nome")).sendKeys(Massa.getContaCadastro());
	   
	}
	
	@When("informo a conta já existente")
	public void informoAContaJáExistente() {
	    
		Driver.getDriver().findElement(By.id("nome")).sendKeys(Massa.getContaMesmoNome());
	}

	@When("seleciono salvar")
	public void selecionoSalvar() {

		Driver.getDriver().findElement(By.tagName("button")).click();
	}

	@Given("seleciono listar")
	public void selecionoListar() {
		Driver.getDriver().findElement(By.linkText("Listar")).click();
	}

@Then("valido se conta já cadastrada está sendo exibida")
public void validoSeContaJáCadastradaEstáSendoExibida(io.cucumber.datatable.DataTable dataTable) {
   
	String contaExistente = Driver.getDriver().findElement(By.xpath("//td[.='Conta para extrato']")).getText();
	assertTrue(contaExistente.contains(dt.getData(dataTable, "nomeConta")));
}
}
