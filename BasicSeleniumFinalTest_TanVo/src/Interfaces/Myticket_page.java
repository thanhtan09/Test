package Interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Myticket_page {
	private static WebElement element;

	public static String xpath_firstcancelbutton = "//table/tbody/tr[2]/td[13]/input";
	public static String xpath_cancelbutton = "//input[@value='Cancel']";
	public static String xpath_textnoticket = "//div[@id='content']";

	// First cancel button
	public static WebElement btn_firstcancel(WebDriver driver) {
		element = driver.findElement(By.xpath(xpath_firstcancelbutton));
		return element;
	}

	// Cancel button
	public static WebElement btn_cancel(WebDriver driver) {
		element = driver.findElement(By.xpath(xpath_cancelbutton));
		return element;
	}

	// Text no ticket is booked
	public static WebElement txt_noticket(WebDriver driver) {
		element = driver.findElement(By.xpath(xpath_textnoticket));
		return element;
	}
}
