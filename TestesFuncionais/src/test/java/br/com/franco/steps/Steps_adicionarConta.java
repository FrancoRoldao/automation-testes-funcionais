package br.com.franco.steps;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;

import br.com.franco.driver.Driver;
import br.com.franco.utils.Massa;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps_adicionarConta {

	@Given("que estou logado na aplicação")
	public void queEstouLogadoNaAplicação() {

		Driver.getDriver().get("https://seubarriga.wcaquino.me/login");
		Driver.getDriver().findElement(By.id("email")).sendKeys("testesfranco@testes.com");
		Driver.getDriver().findElement(By.id("senha")).sendKeys("testes1234");
		Driver.getDriver().findElement(By.tagName("button")).click();
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

	@When("informo a {string}")
	public void informoA(String string) {

		string = Massa.getContaCadastro();
		Driver.getDriver().findElement(By.id("nome")).sendKeys(string);
	}

	@When("seleciono salvar")
	public void selecionoSalvar() {

		Driver.getDriver().findElement(By.tagName("button")).click();
	}

	@Given("seleciono listar")
	public void selecionoListar() {
		Driver.getDriver().findElement(By.linkText("Listar")).click();
	}

	@Then("valido se conta já cadastrada está sendo {string}")
	public void validoSeContaJáCadastradaEstáSendo(String string) {

		String contaExistente = Driver.getDriver().findElement(By.xpath("//td[.='Conta para extrato']")).getText();
		assertTrue(contaExistente.contains(contaExistente));

	}

}
