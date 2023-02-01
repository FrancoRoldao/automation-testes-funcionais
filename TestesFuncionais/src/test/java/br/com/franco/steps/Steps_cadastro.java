package br.com.franco.steps;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.franco.driver.Driver;
import br.com.franco.utils.Massa;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Steps_cadastro {
	
	//private WebDriver driver;
	
	@Given("que acesso a pagina de cadastro")
	public void que_acesso_a_pagina_de_cadastro() {
	    
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\franc\\OneDrive\\Documentos\\chromedriver_win32\\chromedriver.exe");
		
		Driver.getDriver().get("https://seubarriga.wcaquino.me/cadastro");
	}
	
	@Given("preencho um nome {string}")
	public void preenchoUmNome(String string) {
	   
		string = Massa.getNomeCadastro();
		Driver.getDriver().findElement(By.id("nome")).sendKeys(string);
	}
	@Given("preencho um email  {string}")
	public void preenchoUmEmail(String string) {
	    
		string = Massa.getEmailCadastro();
		Driver.getDriver().findElement(By.id("email")).sendKeys(string);
		
	}
	@Given("preencho uma senha {string}")
	public void preenchoUmaSenha(String string) {
	    
		string = Massa.getSenhaCadastro();
		Driver.getDriver().findElement(By.id("senha")).sendKeys(string);
	}
	@When("eu clicar em cadastrar")
	public void euClicarEmCadastrar() {
	    
          Driver.getDriver().findElement(By.xpath("//input[@type='submit']")).click();
	}
	
	@Then("será exibida a mensagem de {string}")
	public void seráExibidaAMensagemDe(String string) {
	    
		String msg = Driver.getDriver().findElement(By.xpath("//div[@class='alert alert-success']")).getText();
		Assert.assertEquals(string, msg);
	}
	
	@After
	public void fechaBrowser() {
		
		Driver.finalizaDriver();
	}






}
