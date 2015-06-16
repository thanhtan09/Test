package Test_case;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Actions.Act_open_railway_page;
import Actions.Act_sign_up_railway_page;
import Actions.Config;
import Interfaces.Register_page;

public class Verify_Sign_up_form_validation {

	@Before
	public void setUp() throws Exception {
		Config.Setup();
	}

	@Test
	public void Verify_sign_up_form_validation() throws Exception {

		WebDriver driver = Config.driver;
		// Step 1: Open LGRailway
		Act_open_railway_page.Excute(driver);

		// Step 2: Click “Register” button
		Act_sign_up_railway_page.Excute(driver, "", "", "", "", "", "", "", "",
				"", "");

		// Verify: There are 09 error messages display beside each required
		// fields
		assertTrue(driver
				.findElement(By.xpath(Register_page.xpath_valida_firstname))
				.getText().contains("Please enter first name"));
		assertTrue(driver
				.findElement(By.xpath(Register_page.xpath_valida_lastname))
				.getText().contains("Please enter last name"));
		assertTrue(driver
				.findElement(By.xpath(Register_page.xpath_valida_address))
				.getText().contains("Please enter address"));
		assertTrue(driver
				.findElement(By.xpath(Register_page.xpath_valida_city))
				.getText().contains("Please enter city"));
		assertTrue(driver
				.findElement(By.xpath(Register_page.xpath_valida_province))
				.getText().contains("Please enter province"));
		assertTrue(driver
				.findElement(By.xpath(Register_page.xpath_valida_email))
				.getText().contains("Invalid email length"));
		assertTrue(driver
				.findElement(By.xpath(Register_page.xpath_valida_pass))
				.getText().contains("Invalid password length"));
		assertTrue(driver.findElement(By.xpath(Register_page.xpath_valida_pid))
				.getText().contains("Invalid ID length"));
		assertTrue(driver
				.findElement(By.xpath(Register_page.xpath_valida_phone))
				.getText().contains("Please enter phone number"));
	}

	@After
	public void tearDown() throws Exception {
		Config.Teadown();
	}
}
