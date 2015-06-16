package Interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ticketprice_page {
	private static WebElement element;

	public static String xpath_ticketprice = "//div[@id='content']/div/div/table/tbody/tr[1]/th";
	
	public static WebElement text_ticketprice(WebDriver driver){
		element = driver.findElement(By.xpath(xpath_ticketprice));
		return element;
	}
}
