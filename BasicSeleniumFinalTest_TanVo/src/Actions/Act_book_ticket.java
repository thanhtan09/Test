package Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import Interfaces.Bookticket_page;
import Interfaces.Main_page;

public class Act_book_ticket {
	public static void Excute(WebDriver driver, String _depart, String _arrive,
			String _seat, String _amount) {

		// Open book ticket page
		Main_page.tab_bookticket(driver).click();

		// Input information
		new Select(Bookticket_page.cbx_departstation(driver))
				.selectByVisibleText(_depart);
		new Select(Bookticket_page.cbx_arrivestation(driver))
				.selectByVisibleText(_arrive);
		if (_seat != "") {
			new Select(Bookticket_page.cbx_seattype(driver))
					.selectByVisibleText(_seat);
		}
		if (_amount != "") {
			new Select(Bookticket_page.cbx_ticketamount(driver))
					.selectByVisibleText(_amount);
		}

		// Click Book button
		Bookticket_page.btn_book(driver).click();
	}
}
