package br.com.franco.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.franco.utils.Massa;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps_cadastro {
	
	private WebDriver driver;
	
	@Given("que acesso a pagina de cadastro")
	public void que_acesso_a_pagina_de_cadastro() {
	    
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\franc\\OneDrive\\Documentos\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://seubarriga.wcaquino.me/cadastro");
	}

	@Given("preencho o {string}")
	public void preencho_o_nome(String string) {
	    
		string = Massa.getNomeCadastro();
		driver.findElement(By.id("nome")).sendKeys(string);
	}

	@Given("preencho o {string}")
	public void preencho_o(String string) {
	    
		string = Massa.getGeradorEmail();
		driver.findElement(By.id("email")).sendKeys(string);
	}

	@Given("preencho a {string}")
	public void preencho_a(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("eu clicar em cadastrar")
	public void eu_clicar_em_cadastrar() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}





}
