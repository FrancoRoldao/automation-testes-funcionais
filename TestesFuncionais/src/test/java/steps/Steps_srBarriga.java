package steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps_srBarriga {
	
	@After
	public void encerraDriver() {
		
		driver.quit();
	}
	
	 private WebDriver driver;
	
	   @Given("que acesso a pagina de login")
		public void que_acesso_a_pagina_de_login() {
		    
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\franc\\OneDrive\\Documentos\\chromedriver_win32\\chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.get("https://seubarriga.wcaquino.me/login");
			
		}

	   @Given("preencho o campo senha com {string}")
	   public void preencho_o_campo_senha_com(String string) {
	       
		   driver.findElement(By.id("senha")).sendKeys(string);
	   }

	   @When("eu clicar em entrar")
	   public void eu_clicar_em_entrar() {
	       
		   driver.findElement(By.tagName("button")).click();
	   }

	   @Then("será exibida a mensagem de erro {string}")
	   public void será_exibida_a_mensagem_de_erro(String string) {
	       
		   String msgErro = driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
		   assertEquals(msgErro, string);
	   }

	   @Given("preencho o campo email com {string}")
	   public void preencho_o_campo_email_com(String string) {
	       
		   driver.findElement(By.id("email")).sendKeys(string);
	   }



}
