package Actions;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import Interfaces.Main_page;

public class Act_click_checkticket_link {

	public static String Excute(WebDriver driver) {
		// Open Ticket price page
		Main_page.tab_ticketprice(driver).click();

		// Get name ticket and click on Check price link by random
		String ticketname = "";
		
		while(true){
			int tr = randomTr();
			String checkticketlink = "//table/tbody/tr[" + tr
					+ "]/td/a[text()='Check Price']";
			
			if (hasCheckticketlink(driver, checkticketlink) == true) {
				ticketname = driver.findElement(
						By.xpath("//table/tbody/tr[" + tr + "]/td[1]")).getText();
				driver.findElement(By.xpath(checkticketlink)).click();
				break;
			}
		}		

		return ticketname;
	}

	//Get randome tr
	private static int randomTr(){
		Random generator = new Random();
		int tr = 30 - generator.nextInt(30);
		
		return tr;
	}
	
	//Check the Check ticket link exist
	private static boolean hasCheckticketlink(WebDriver driver, String _xpath) {
		try {
			driver.findElement(By.xpath(_xpath));
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}

	}

}
