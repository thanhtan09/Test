package Actions;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Interfaces.Bookticket_page;
import Interfaces.Main_page;

public class Act_book_random_ticket {

	public static void Excute(WebDriver driver){
		
		//Open timetable page
		Main_page.tab_timetable(driver).click();
		
		//Random position of Book ticket
		Random generator = new Random();
		int tr = 24 - generator.nextInt(24);
		
		//Book random ticket
		driver.findElement(By.xpath("//table/tbody/tr["+tr+"]/td[7]/a")).click();
		
		Bookticket_page.btn_book(driver).click();
	}
}
