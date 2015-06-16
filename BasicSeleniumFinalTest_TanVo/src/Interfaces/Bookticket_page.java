package Interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Bookticket_page {
	private static WebElement element;

	public static String xpath_departstation = "//select[@name='DepartStation']";
	public static String xpath_arrivestation = "//select[@name='ArriveStation']";
	public static String xpath_seattype = "//select[@name='SeatType']";
	public static String xpath_ticketamount = "//select[@name='TicketAmount']";
	public static String xpath_bookbutton = "//input[@type='submit' and @value='Book ticket']";
	public static String xpath_booksuccess = "//div[@id='content']/h1[text()='Ticket booked successfully!']";

	// Depart station combobox
	public static WebElement cbx_departstation(WebDriver driver) {
		element = driver.findElement(By.xpath(xpath_departstation));
		return element;
	}

	// Arrive station combobox
	public static WebElement cbx_arrivestation(WebDriver driver) {
		element = driver.findElement(By.xpath(xpath_arrivestation));
		return element;
	}

	// Seat type combobox
	public static WebElement cbx_seattype(WebDriver driver) {
		element = driver.findElement(By.xpath(xpath_seattype));
		return element;
	}

	// Ticket Amount combobox
	public static WebElement cbx_ticketamount(WebDriver driver) {
		element = driver.findElement(By.xpath(xpath_ticketamount));
		return element;
	}

	// Book button
	public static WebElement btn_book(WebDriver driver) {
		element = driver.findElement(By.xpath(xpath_bookbutton));
		return element;
	}
}
