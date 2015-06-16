package Test_case;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Actions.Act_book_random_ticket;
import Actions.Act_cancel_all_ticket;
import Actions.Act_login_railway_page;
import Actions.Act_open_railway_page;
import Actions.Config;
import Actions.Constant;
import Interfaces.Bookticket_page;

public class Verify_user_can_book_a_ticket {
	@Before
	public void setUp() throws Exception {
		Config.Setup();
	}

	@Test
	public void Verify_that_user_can_book_a_ticket() throws Exception {

		WebDriver driver = Config.driver;
		// Open LGRailway
		Act_open_railway_page.Excute(driver);

		// Login to the LG Railway
		Act_login_railway_page.Excute(driver, Constant.email,
				Constant.password);

		// Book a ticket with a random depart & arrive station
		Act_book_random_ticket.Excute(driver);
		
		// Verify: The text “Ticket booked successfully!” is displayed
		assertTrue(Config.isElementPresent(By
				.xpath(Bookticket_page.xpath_booksuccess)));
				
	}

	@After
	public void tearDown() throws Exception {
		Act_cancel_all_ticket.Excute(Config.driver);	
		Config.Teadown();
	}
}
