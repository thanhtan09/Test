package Interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_page {
	private static WebElement element;

	public static String xpath_usernamefield = "//input[@id='username']";
	public static String xpath_passwordfield = "//input[@id='password']";
	public static String xpath_loginbutton = "//input[@type='submit' or @value='login']";
	public static String xpath_welcome = "//div[@class='account']";

	// Email texbox
	public static WebElement txt_username(WebDriver driver) {
		element = driver.findElement(By.xpath(xpath_usernamefield));
		return element;
	}

	// Password texbox
	public static WebElement txt_password(WebDriver driver) {
		element = driver.findElement(By.xpath(xpath_passwordfield));
		return element;
	}

	// Login button
	public static WebElement btn_login(WebDriver driver) {
		element = driver.findElement(By.xpath(xpath_loginbutton));
		return element;
	}

	// Welcome text
	public static WebElement txt_welcome(WebDriver driver) {
		element = driver.findElement(By.xpath(xpath_welcome));
		return element;
	}
}
