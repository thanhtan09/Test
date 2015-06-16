package Actions;

import org.openqa.selenium.WebDriver;

import Interfaces.Login_page;
import Interfaces.Main_page;

public class Act_login_railway_page {
	public static void Excute(WebDriver driver, String _username,
			String _password) {
		// Open login page
		Main_page.tab_login(driver).click();

		// Input username and password
		Login_page.txt_username(driver).clear();
		Login_page.txt_username(driver).sendKeys(_username);

		Login_page.txt_password(driver).clear();
		Login_page.txt_password(driver).sendKeys(_password);

		// Click login button
		Login_page.btn_login(driver).click();
	}
}
