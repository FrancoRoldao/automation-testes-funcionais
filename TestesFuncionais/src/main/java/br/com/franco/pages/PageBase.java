package br.com.franco.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.franco.driver.Driver;

public class PageBase {
	
	

	public static void getPage() {
		
		Driver.getDriver().get("https://seubarriga.wcaquino.me/login");
	}
	
	public static void loginPadrao() {
		
		Driver.getDriver().findElement(By.id("email")).sendKeys("testesfranco@testes.com");
		Driver.getDriver().findElement(By.id("senha")).sendKeys("testes1234");
		Driver.getDriver().findElement(By.tagName("button")).click();
	}
}
