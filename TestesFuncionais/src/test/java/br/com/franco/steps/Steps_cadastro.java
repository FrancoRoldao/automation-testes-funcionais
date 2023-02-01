package br.com.franco.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.franco.utils.Massa;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Steps_cadastro {
	
	private WebDriver driver;
	
	@After
	public void finalizaDriver() {
		
		driver.quit();
	}
	
	@Given("que acesso a pagina de cadastro")
	public void que_acesso_a_pagina_de_cadastro() {
	    
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\franc\\OneDrive\\Documentos\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://seubarriga.wcaquino.me/cadastro");
	}





}
