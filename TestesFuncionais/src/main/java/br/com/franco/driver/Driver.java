package br.com.franco.driver;

// CENTRALIZANDO DRIVER

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

	private static WebDriver driver;

	private Driver() {}


	public static WebDriver getDriver() {

		if (driver == null) {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\franc\\OneDrive\\Documentos\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();


		}
		return driver;
	}

	public static void finalizaDriver() {
		if(driver != null) {
			driver.quit();
			driver = null;
		}
	}

}
