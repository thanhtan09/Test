package Interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Register_page {
	
	private static WebElement element;
	
	public static String xpath_firstname = "//input[@id='firstname']";
	public static String xpath_lastname = "//input[@id='lastname']";
	public static String xpath_address = "//input[@id='address']";
	public static String xpath_city = "//input[@id='city']";
	public static String xpath_province = "//input[@id='province']";
	public static String xpath_email = "//input[@id='email']";
	public static String xpath_password = "//input[@id='password']";
	public static String xpath_confirmpass = "//input[@id='confirmPassword']";
	public static String xpath_pid = "//input[@id='pid']";
	public static String xpath_phone = "//input[@id='phone']";
	public static String xpath_registerbutton = "//input[@value='Register']";
	
	//Validation
	public static String xpath_valida_firstname = "//label[@for='firstname' and @class='validation-error']";
	public static String xpath_valida_lastname = "//input[@id='lastname']/ancestor::td/label[@class='validation-error']";
	public static String xpath_valida_address = "//input[@id='address']/ancestor::td/label[@class='validation-error']";
	public static String xpath_valida_city = "//input[@id='city']/ancestor::td/label[@class='validation-error']";
	public static String xpath_valida_province = "//input[@id='province']/ancestor::td/label[@class='validation-error']";
	public static String xpath_valida_email = "//input[@id='email']/ancestor::td/label[@class='validation-error']";
	public static String xpath_valida_pass = "//input[@id='password']/ancestor::td/label[@class='validation-error']";
	public static String xpath_valida_pid = "//input[@id='pid']/ancestor::td/label[@class='validation-error']";
	public static String xpath_valida_phone = "//input[@id='phone']/ancestor::td/label[@class='validation-error']";
	
	//First name
	public static WebElement txt_firstname(WebDriver driver){
		element = driver.findElement(By.xpath(xpath_firstname));
		return element;
	}
	
	//Last name
	public static WebElement txt_lastname(WebDriver driver){
		element = driver.findElement(By.xpath(xpath_lastname));
		return element;
	}
	
	//Address
	public static WebElement txt_address(WebDriver driver){
		element = driver.findElement(By.xpath(xpath_address));
		return element;
	}
	
	//City
	public static WebElement txt_city(WebDriver driver){
		element = driver.findElement(By.xpath(xpath_city));
		return element;
	}
	
	//Province
	public static WebElement txt_province(WebDriver driver){
		element = driver.findElement(By.xpath(xpath_province));
		return element;
	}
	
	//Email
	public static WebElement txt_mail(WebDriver driver){
		element = driver.findElement(By.xpath(xpath_email));
		return element;
	}
	
	//Password
	public static WebElement txt_password(WebDriver driver){
		element = driver.findElement(By.xpath(xpath_password));
		return element;
	}
	
	//Confirm password
	public static WebElement txt_confirmpass(WebDriver driver){
		element = driver.findElement(By.xpath(xpath_confirmpass));
		return element;
	}
	
	//Pid
	public static WebElement txt_pid(WebDriver driver){
		element = driver.findElement(By.xpath(xpath_pid));
		return element;
	}
	
	//Phone
	public static WebElement txt_phone(WebDriver driver){
		element = driver.findElement(By.xpath(xpath_phone));
		return element;
	}
	
	//Register button
	public static WebElement btn_register(WebDriver driver){
		element = driver.findElement(By.xpath(xpath_registerbutton));
		return element;
	}
}
