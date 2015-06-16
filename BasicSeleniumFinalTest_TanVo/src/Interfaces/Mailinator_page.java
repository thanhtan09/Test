package Interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Mailinator_page {
	private static WebElement element;

	public static String xpath_mailfield = "//input[@id='inboxfield']";
	public static String xpath_checkbutton = "//input[@id='inboxfield']/ancestor::div/btn";
	public static String xpath_frame = "//iframe[@name='rendermail']";
	public static String xpath_confirmsubject = "//div/following-sibling::div[contains(text(),'Please confirm your account')]";
	public static String xpath_confirmlink = "//div[@class='mailview']/descendant::a";

	// Mail texbox
	public static WebElement txt_mail(WebDriver driver) {
		element = driver.findElement(By.xpath(xpath_mailfield));
		return element;
	}

	// Check button
	public static WebElement btn_check(WebDriver driver) {
		element = driver.findElement(By.xpath(xpath_checkbutton));
		return element;
	}

	// Subject mail
	public static WebElement lnk_subjectmail(WebDriver driver) {
		element = driver.findElement(By.xpath(xpath_confirmsubject));
		return element;
	}

	// Active link
	public static WebElement lnk_confirm(WebDriver driver) {
		element = driver.findElement(By.xpath(xpath_confirmlink));
		return element;
	}

	// Iframe
	public static WebElement iframe(WebDriver driver) {
		element = driver.findElement(By.xpath(xpath_frame));
		return element;
	}
}
