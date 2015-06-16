package Test_case;

import static org.junit.Assert.assertFalse;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import Actions.Act_book_ticket;
import Actions.Act_cancel_all_ticket;
import Actions.Act_cancel_ticket;
import Actions.Act_login_railway_page;
import Actions.Act_logout_railway_page;
import Actions.Act_open_railway_page;
import Actions.Act_verify_ticket_removed;
import Actions.Config;
import Actions.Constant;

public class Verify_user_can_cancel_a_booked_ticket {

	@Before
	public void setUp() throws Exception {
		Config.Setup();
	}

	@Test
	public void Verify_that_user_can_cancel_a_booked_ticket() throws Exception {

		WebDriver driver = Config.driver;
		// Open LGRailway

		// Login to the LG Railway

		// Pre-condition: There’re 02 booked tickets; 1 ticket from “Phan Thiết”
		// to “Nha Trang” and 1 ticket from “Nha Trang” to “Đà Nẵng”.
		Act_open_railway_page.Excute(driver);
		Act_login_railway_page
				.Excute(driver, Constant.email, Constant.password);

		Act_book_ticket.Excute(driver, Constant.departStation1,
				Constant.arriveStation1, "", "");
		Act_book_ticket.Excute(driver, Constant.departStation2,
				Constant.arriveStation2, "", "");
		// Log out
		Act_logout_railway_page.Excute(driver);

		// Step 1: Login to the LG Railway
		Act_login_railway_page
				.Excute(driver, Constant.email, Constant.password);

		// Step 2+3: Cancel the ticket
		Act_cancel_ticket.Excute(driver, Constant.departStation2,
				Constant.arriveStation2);

		// Verify: The ticket is removed from “My Ticket” page
		assertFalse(Act_verify_ticket_removed.Excute(driver,
				Constant.departStation2, Constant.arriveStation2));		
	}

	@After
	public void tearDown() throws Exception {
		Act_cancel_all_ticket.Excute(Config.driver);
		Config.Teadown();
	}
}
