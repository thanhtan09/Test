package Test_case;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertTrue;

import Actions.Act_click_checkticket_link;
import Actions.Act_open_railway_page;
import Actions.Config;
import Interfaces.Ticketprice_page;

public class Verify_Ticket_Price_page_displays_correct_stations {
	@Before
	public void setUp() throws Exception {
		Config.Setup();
	}

	@Test
	public void Verify_That_Ticket_Price_page_displays_correct_stations()
			throws Exception {

		WebDriver driver = Config.driver;
		// Open LGRailway
		Act_open_railway_page.Excute(driver);

		// Click ‘check price’ link on a random row
		String currentticket = Act_click_checkticket_link.Excute(driver);

		// The text “Ticket price from … to …” displays depart and arrive
		// stations correctly
		assertTrue(Ticketprice_page.text_ticketprice(driver).getText()
				.contains("icket price from " + currentticket));

	}

	@After
	public void tearDown() throws Exception {
		Config.Teadown();
	}
}
