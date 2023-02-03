package br.com.franco.steps;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import br.com.franco.driver.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Steps_movimentacao {
	
	@Given("seleciono criar movimentação")
	public void selecionoCriarMovimentação() {
	    
		Driver.getDriver().findElement(By.linkText("Criar Movimentação")).click();
	}
	
	@Given("preencho o tipo de movimentacao {string}")
	public void preenchoOTipoDeMovimentacao(String string) {
	    
		WebElement selectElement = Driver.getDriver().findElement(By.xpath("//select[@id='tipo']"));
		Select select = new Select(selectElement);
	    List<WebElement> options = select.getOptions();
	    select.selectByVisibleText(string);
		
	}
	
	
	@Given("preencho a data da movimentacao {int}\\/{int}\\/{int}")
	public void preenchoADataDaMovimentacao(Integer int1, Integer int2, Integer int3) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Given("preencho a data do pagamento  {int}\\/{int}\\/{int}")
	public void preenchoADataDoPagamento(Integer int1, Integer int2, Integer int3) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Given("preencho o interessado {string}")
	public void preenchoOInteressado(String string) {
	   
		Driver.getDriver().findElement(By.id("interessado")).sendKeys(string);
		assertEquals("eu", Driver.getDriver().findElement(By.id("interessado")).getText());
	}
	@Given("preencho o valor {string}")
	public void preenchoOValor(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Given("seleciono a conta {string}")
	public void selecionoAConta(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Given("seleciono a situação {string}")
	public void selecionoASituação(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("clico em salvar")
	public void clicoEmSalvar() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}




}
