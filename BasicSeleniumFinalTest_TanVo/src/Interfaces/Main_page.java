package Interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Main_page {
	private static WebElement element;

	public static String xpath_logintab = "//a[@href='/Account/Login.cshtml']";
	public static String xpath_booktickettab = "//a[@href='/Page/BookTicketPage.cshtml']";
	public static String xpath_mytickettab = "//a[@href='/Page/ManageTicket.cshtml']";
	public static String xpath_registertab = "//span[text()='Register']";
	public static String xpath_timetable = "//span[text()='Timetable']";
	public static String xpath_logouttab = "//span[text()='Log out']";
	public static String xpath_ticketprice = "//span[text()='Ticket price']";

	// Login tab
	public static WebElement tab_login(WebDriver driver) {
		element = driver.findElement(By.xpath(xpath_logintab));
		return element;
	}

	// Book ticket tab
	public static WebElement tab_bookticket(WebDriver driver) {
		element = driver.findElement(By.xpath(xpath_booktickettab));
		return element;
	}

	// My ticket tab
	public static WebElement tab_myticket(WebDriver driver) {
		element = driver.findElement(By.xpath(xpath_mytickettab));
		return element;
	}

	// Register tab
	public static WebElement tab_register(WebDriver driver) {
		element = driver.findElement(By.xpath(xpath_registertab));
		return element;
	}

	// Timetable tab
	public static WebElement tab_timetable(WebDriver driver) {
		element = driver.findElement(By.xpath(xpath_timetable));
		return element;
	}

	// Log out tab
	public static WebElement tab_logout(WebDriver driver) {
		element = driver.findElement(By.xpath(xpath_logouttab));
		return element;
	}

	// Ticket price tab
	public static WebElement tab_ticketprice(WebDriver driver) {
		element = driver.findElement(By.xpath(xpath_ticketprice));
		return element;
	}
}
