package Test_case;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import Actions.Act_login_railway_page;
import Actions.Act_open_mailinatorbox;
import Actions.Act_open_railway_page;
import Actions.Act_sign_up_railway_page;
import Actions.Config;
import Actions.Constant;
import Interfaces.Login_page;

public class Verify_user_can_sign_up_new_account {

	@Before
	public void setUp() throws Exception {
		Config.Setup();
	}

	@Test
	public void Verify_that_user_can_sign_up_new_account() throws Exception {

		WebDriver driver = Config.driver;
		// Open LGRailway
		Act_open_railway_page.Excute(driver);

		// Register new account
		Act_sign_up_railway_page.Excute(driver, Constant.firstname,
				Constant.lastname, Constant.address, Constant.city,
				Constant.province, Constant.randomemail, Constant.password,
				Constant.password, Constant.pid, Constant.phone);

		// Click confirm link
		Act_open_mailinatorbox.Excute(driver, Constant.randomemail);

		// Login with new account
		Config.switchNewbrowser(driver);
		Act_login_railway_page.Excute(driver, Constant.randomemail,
				Constant.password);

		// Verify: User can login with the newly created account
		assertTrue(Login_page.txt_welcome(driver).getText()
				.contains("Welcome " + Constant.randomemail));
	}

	@After
	public void tearDown() throws Exception {
		Config.Teadown();
	}
}
